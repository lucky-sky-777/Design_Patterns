package baitap.singleton;

public class Client {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                PrintSpooler printSpooler = PrintSpooler.getSyncInstance();
                printSpooler.print();
            }).start();
        }
        for (int i = 1; i <= 10; i++) {
            PrintSpooler printSpooler = PrintSpooler.getSyncInstance();
            printSpooler.print();
        }

    }

}