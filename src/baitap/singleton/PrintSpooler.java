package baitap.singleton;

@SuppressWarnings("all")
public class PrintSpooler {

    private static volatile PrintSpooler INSTANCE;

    private int value = 0;

    private PrintSpooler() {
        init();
    }

    public static synchronized PrintSpooler getSyncInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PrintSpooler();
        }
        return INSTANCE;
    }

    public static synchronized PrintSpooler getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PrintSpooler();
        }
        return INSTANCE;
    }

    private void init() {
        System.out.println("init " + value++);
    }

    public void print() {
        System.out.println("Printing..." + value++);
    }

}