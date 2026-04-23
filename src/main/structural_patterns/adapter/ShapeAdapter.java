package main.structural_patterns.adapter;

public class ShapeAdapter implements Shape {

    private AnotherShape anotherShape;

    public ShapeAdapter(AnotherShape anotherShape) {
        this.anotherShape = anotherShape;
    }

    @Override
    public void draw(String color, String type, int size, float opacity) {
        anotherShape.draw(color, type);
    }

}