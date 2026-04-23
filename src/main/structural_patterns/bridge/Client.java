package main.structural_patterns.bridge;

public class Client {

    public static void main(String[] args) {
        Shape blackCircle = new Circle(new BlackColor());
        Shape whiteSquare = new Square(new WhiteColor());

        blackCircle.draw();
        whiteSquare.draw();
    }

}