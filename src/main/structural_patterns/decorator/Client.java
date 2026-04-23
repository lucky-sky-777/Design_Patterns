package main.structural_patterns.decorator;

public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        System.out.println("\n");

        Shape shadowCircle = new ShadowShapeDecorator(new Circle());
        shadowCircle.draw();

        System.out.println("\n");

        Shape square = new Square();
        square.draw();

        System.out.println("\n");

        Shape shadowBlurSquare = new BlurShapeDecorator(new ShadowShapeDecorator(new Square()));
        shadowBlurSquare.draw();
    }

}