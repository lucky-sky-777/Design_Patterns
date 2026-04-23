package main.structural_patterns.decorator;

public class BlurShapeDecorator extends ShapeDecorator {

    public BlurShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Effect: Blur");
    }

}