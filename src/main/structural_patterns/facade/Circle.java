package main.structural_patterns.facade;

import main.structural_patterns.facade.constant.Type;

public class Circle extends Shape {

    public Circle() {
        setType(Type.CIRCLE);
    }

    @Override
    protected void draw() {
        System.out.println("Draw Circle");
    }

}