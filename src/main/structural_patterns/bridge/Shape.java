package main.structural_patterns.bridge;

public abstract class Shape {

    protected ShapeColor shapeColor;

    public Shape(ShapeColor shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract void draw();

}