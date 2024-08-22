package algorithms.search.lru.demo2;

import java.util.LinkedHashMap;

public class Cache<K,V> {
    private LinkedHashMap<K,V> cache;
    int size;

    public Cache(int size){
        this.cache = new LinkedHashMap<>();
        this.size = size;
    }

    public <V>Object getElement(K key){
        if (cache.containsKey(key) ){
            return cache.get(key);
        }

        return null;

    }

    public boolean put(K key, V value){
        if (cache.containsKey(key)){
            //update to most recent top
            /*cache.remove(key);
            cache.putFirst(key, value);*/
            System.out.println(cache);
        }else{
//            cache.putFirst(key, value);
        }
        return true;

    }
}
