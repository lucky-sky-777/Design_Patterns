package main.creational_patterns.factory_method.complete_factory_method.sub_shape_factory;

import main.creational_patterns.factory_method.complete_factory_method.Shape;
import main.creational_patterns.factory_method.complete_factory_method.ShapeFactory;
import main.creational_patterns.factory_method.complete_factory_method.sub_shape.Square;

public class SquareFactory extends ShapeFactory {

    @Override
    public Shape createShape() {
        return new Square();
    }

}