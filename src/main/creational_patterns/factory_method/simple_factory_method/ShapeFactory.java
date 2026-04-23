package main.creational_patterns.factory_method.simple_factory_method;

import main.creational_patterns.factory_method.simple_factory_method.sub_shape.Circle;
import main.creational_patterns.factory_method.simple_factory_method.sub_shape.Square;

public class ShapeFactory {

    private ShapeFactory() {}

    public static final Shape createShape(ShapeType shapeType) {
        return switch (shapeType) {
            case ShapeType.CIRCLE -> new Circle();
            case ShapeType.SQUARE -> new Square();
        };
    }

}