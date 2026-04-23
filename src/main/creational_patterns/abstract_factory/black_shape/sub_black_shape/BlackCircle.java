package main.creational_patterns.abstract_factory.black_shape.sub_black_shape;

import main.creational_patterns.abstract_factory.black_shape.BlackShape;

public class BlackCircle implements BlackShape {

    @Override
    public void draw() {
        System.out.println("Draw Black Circle");
    }

}