package main.creational_patterns.factory_method.simple_factory_method;

public class Client {

    public static void main(String[] args) {
        Shape shape;

        shape = ShapeFactory.createShape(ShapeType.CIRCLE);
        shape.draw();

        shape = ShapeFactory.createShape(ShapeType.SQUARE);
        shape.draw();
    }

}