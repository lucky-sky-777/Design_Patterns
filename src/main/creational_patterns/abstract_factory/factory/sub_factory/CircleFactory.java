package main.creational_patterns.abstract_factory.factory.sub_factory;

import main.creational_patterns.abstract_factory.black_shape.BlackShape;
import main.creational_patterns.abstract_factory.white_shape.WhiteShape;
import main.creational_patterns.abstract_factory.factory.ShapeFactory;
import main.creational_patterns.abstract_factory.black_shape.sub_black_shape.BlackCircle;
import main.creational_patterns.abstract_factory.white_shape.sub_white_shape.WhiteCircle;

public class CircleFactory implements ShapeFactory {

    @Override
    public BlackShape createBlackShape() {
        return new BlackCircle();
    }

    @Override
    public WhiteShape createWhiteShape() {
        return new WhiteCircle();
    }

}