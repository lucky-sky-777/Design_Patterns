package main.structural_patterns.decorator;

public class ShadowShapeDecorator extends ShapeDecorator {

    public ShadowShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Effect: Shadow");
    }

}