package baitap.factory;

public abstract class CandyFactory {

    public abstract Candy createCandy();

    public void displayCandy() {
        Candy candy = createCandy();
        candy.display();
    }

}