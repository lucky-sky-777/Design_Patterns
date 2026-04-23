package baitap.structural_patterns.decorator;

public abstract class ShapeDecorator implements Shape {
	// Composition: The decorator holds a reference to a Shape
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw(); // Delegate the core work to the wrapped shape
	}
}