package main.creational_patterns.abstract_factory.factory;

import main.creational_patterns.abstract_factory.black_shape.BlackShape;
import main.creational_patterns.abstract_factory.white_shape.WhiteShape;

public interface ShapeFactory {

    BlackShape createBlackShape();
    WhiteShape createWhiteShape();

}