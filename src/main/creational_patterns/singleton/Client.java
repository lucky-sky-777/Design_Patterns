package main.creational_patterns.singleton;

import main.creational_patterns.singleton.type.*;

public class Client {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton
                = EagerSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton
                = StaticBlockSingleton.getInstance();
        LazySingleton lazySingleton
                = LazySingleton.getInstance();
        SynchronizeSingleton synchronizeSingleton
                = SynchronizeSingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton
                = DoubleCheckSingleton.getInstance();
        BillPughSingleton billPughSingleton
                = BillPughSingleton.getInstance();
        EnumSingleton enumSingleton
                = EnumSingleton.INSTANCE;

        MonostateSingleton monostateSingleton1
                = new MonostateSingleton();
        monostateSingleton1.setState("mono1");
        System.out.println("State 1: " + monostateSingleton1.getState());

        MonostateSingleton monostateSingleton2
                = new MonostateSingleton();
        System.out.println("State 2: " + monostateSingleton2.getState());

        ExampleService service1 = SingletonRegistry.getInstance("EXAMPLE_SERVICE", ExampleService.class);
        ExampleService service2 = SingletonRegistry.getInstance("EXAMPLE_SERVICE", ExampleService.class);
        System.out.println("Service1 == Service2: " + (service1 == service2));
    }

}