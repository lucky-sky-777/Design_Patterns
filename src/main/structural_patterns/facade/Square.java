package main.structural_patterns.facade;

import main.structural_patterns.facade.constant.Type;

public class Square extends Shape {

    public Square() {
        setType(Type.SQUARE);
    }

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }

}