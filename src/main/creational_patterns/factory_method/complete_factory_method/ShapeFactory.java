package main.creational_patterns.factory_method.complete_factory_method;

public abstract class ShapeFactory {

    public abstract Shape createShape();

    public void renderShape() {
        Shape shape = createShape();
        shape.draw();
    }

}