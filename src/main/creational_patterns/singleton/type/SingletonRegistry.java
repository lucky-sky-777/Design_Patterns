package main.creational_patterns.singleton.type;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SingletonRegistry {

    private static final Map<String, Object> registry = new ConcurrentHashMap<>();

    private SingletonRegistry() {}

    public static <T> T getInstance(String key, Class<T> clazz) {
        Object instance = SingletonRegistry.registry.computeIfAbsent(key, k -> {
            try {
                return clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException();
            }
        });

        return clazz.cast(instance);
    }

}