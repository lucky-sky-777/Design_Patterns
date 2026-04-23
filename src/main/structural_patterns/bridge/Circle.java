package main.structural_patterns.bridge;

public class Circle extends Shape {

    public Circle(ShapeColor shapeColor) {
        super(shapeColor);
    }

    @Override
    public void draw() {
        System.out.println("Draw " + shapeColor.getColor() + " Circle");
    }

}