package main.creational_patterns.singleton.type;

public class SynchronizeSingleton {

    private static volatile SynchronizeSingleton INSTANCE;

    private SynchronizeSingleton() {}

    public static synchronized SynchronizeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SynchronizeSingleton();
        }
        return INSTANCE;
    }

}