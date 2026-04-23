package main.creational_patterns.factory_method.complete_factory_method.sub_shape;

import main.creational_patterns.factory_method.complete_factory_method.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }

}