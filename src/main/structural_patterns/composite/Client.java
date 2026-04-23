package main.structural_patterns.composite;

import main.structural_patterns.composite.constant.Color;

public class Client {

    public static void main(String[] args) {
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape square1 = new Square();
        Shape square2 = new Square();

        ShapeGroup circleGroup = new ShapeGroup();
        circleGroup.add(circle1);
        circleGroup.add(circle2);

        ShapeGroup squareGroup = new ShapeGroup();
        squareGroup.add(circleGroup);
        squareGroup.add(square1);
        squareGroup.add(square2);

        squareGroup.draw(Color.BLACK);
    }

}