package main.creational_patterns.factory_method.complete_factory_method;

import main.creational_patterns.factory_method.complete_factory_method.sub_shape_factory.CircleFactory;
import main.creational_patterns.factory_method.complete_factory_method.sub_shape_factory.SquareFactory;

public class Client {

    public static void main(String[] args) {
        ShapeFactory shapeFactory;

        shapeFactory = new CircleFactory();
        shapeFactory.renderShape();

        shapeFactory = new SquareFactory();
        shapeFactory.renderShape();
    }

}