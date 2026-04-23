package main.creational_patterns.singleton.type;

public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton INSTANCE;

    private DoubleCheckSingleton() {}

    public static DoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }

}