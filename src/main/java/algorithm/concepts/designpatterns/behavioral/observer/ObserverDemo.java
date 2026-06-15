package algorithm.concepts.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================================
 *  OBSERVER (behavioral)
 * ============================================================================
 *
 *  Define a one-to-many dependency: when one object (the SUBJECT) changes
 *  state, all its dependents (the OBSERVERS) are notified automatically. The
 *  subject knows nothing about the concrete observers — only the interface.
 *
 *  WHEN TO USE
 *  -----------
 *  Event systems, publish/subscribe, UI listeners, reacting to state changes
 *  without coupling the source to the reactors. (Spring's ApplicationEvent and
 *  Java's old java.util.Observer are real-world incarnations.)
 * ============================================================================
 */
public class ObserverDemo {

    public static void main(String[] args) {
        System.out.println("=== Observer ===");
        WeatherStation station = new WeatherStation();

        station.subscribe(t -> System.out.println("Phone display: " + t + "C"));
        Observer logger = t -> System.out.println("Logger: temperature = " + t);
        station.subscribe(logger);

        station.setTemperature(21);   // both observers react
        station.unsubscribe(logger);
        station.setTemperature(25);   // only the phone display reacts now
    }

    /** Observers implement this; it is a functional interface, so lambdas work. */
    interface Observer {
        void update(int temperature);
    }

    /** The subject — keeps a list of observers and notifies them on change. */
    static class WeatherStation {
        private final List<Observer> observers = new ArrayList<>();
        private int temperature;

        void subscribe(Observer o)   { observers.add(o); }
        void unsubscribe(Observer o) { observers.remove(o); }

        void setTemperature(int t) {
            this.temperature = t;
            System.out.println("-- temperature changed to " + t + " --");
            for (Observer o : observers) o.update(temperature);   // notify all
        }
    }
}
