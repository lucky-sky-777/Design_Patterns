package main.creational_patterns.abstract_factory;

import main.creational_patterns.abstract_factory.factory.ShapeFactory;
import main.creational_patterns.abstract_factory.factory.sub_factory.CircleFactory;
import main.creational_patterns.abstract_factory.factory.sub_factory.SquareFactory;
import main.creational_patterns.abstract_factory.black_shape.BlackShape;
import main.creational_patterns.abstract_factory.white_shape.WhiteShape;

public class Client {

    public static void main(String[] args) {
        ShapeFactory shapeFactory;
        BlackShape blackShape;
        WhiteShape whiteShape;

        shapeFactory = new CircleFactory();
        blackShape = shapeFactory.createBlackShape();
        whiteShape = shapeFactory.createWhiteShape();
        blackShape.draw();
        whiteShape.draw();

        shapeFactory = new SquareFactory();
        blackShape = shapeFactory.createBlackShape();
        whiteShape = shapeFactory.createWhiteShape();
        blackShape.draw();
        whiteShape.draw();
    }

}