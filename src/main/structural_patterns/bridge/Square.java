package main.structural_patterns.bridge;

public class Square extends Shape {

    public Square(ShapeColor shapeColor) {
        super(shapeColor);
    }

    @Override
    public void draw() {
        System.out.println("Draw " + shapeColor.getColor() + " Square");
    }

}