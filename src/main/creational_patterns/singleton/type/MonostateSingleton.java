package main.creational_patterns.singleton.type;

public class MonostateSingleton {

    private static String state = "default state";

    public MonostateSingleton() {}

    public void setState(String state) {
        MonostateSingleton.state = state;
    }

    public String getState() {
        return MonostateSingleton.state;
    }

}