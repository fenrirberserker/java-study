package concepts.threads.locks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ============================================================================
 *  ReadWriteLock — many readers OR one writer
 * ============================================================================
 *  Allows MULTIPLE threads to hold the read lock at the same time, but the
 *  write lock is EXCLUSIVE. Ideal when reads vastly outnumber writes (caches,
 *  configuration, lookup tables).
 *
 *  Rules:
 *    - read lock blocks while a writer holds the write lock
 *    - write lock blocks while ANY reader or writer holds a lock
 *    - read locks do NOT block each other
 * ============================================================================
 */
public class ReadWriteLockExample {

    private final Map<String, String> cache = new HashMap<>();
    private final ReadWriteLock rw = new ReentrantReadWriteLock();

    public String get(String key) {
        rw.readLock().lock();
        try {
            return cache.get(key);
        } finally {
            rw.readLock().unlock();
        }
    }

    public void put(String key, String value) {
        rw.writeLock().lock();
        try {
            cache.put(key, value);
        } finally {
            rw.writeLock().unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLockExample c = new ReadWriteLockExample();
        c.put("user", "alice");

        Runnable reader = () -> System.out.println(Thread.currentThread().getName() + " saw " + c.get("user"));
        Runnable writer = () -> { c.put("user", "bob"); System.out.println("writer updated"); };

        new Thread(reader, "r1").start();
        new Thread(reader, "r2").start();
        new Thread(writer, "w1").start();
        new Thread(reader, "r3").start();

        Thread.sleep(200);
    }
}
