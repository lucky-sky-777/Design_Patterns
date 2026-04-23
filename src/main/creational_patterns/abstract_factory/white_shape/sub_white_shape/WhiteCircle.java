package main.creational_patterns.abstract_factory.white_shape.sub_white_shape;

import main.creational_patterns.abstract_factory.white_shape.WhiteShape;

public class WhiteCircle implements WhiteShape {

    @Override
    public void draw() {
        System.out.println("Draw White Circle");
    }

}