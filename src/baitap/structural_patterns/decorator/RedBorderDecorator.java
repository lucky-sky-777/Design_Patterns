package baitap.structural_patterns.decorator;

public class RedBorderDecorator extends ShapeDecorator {

	public RedBorderDecorator(Shape decoratedShape) {
		super(decoratedShape); // Pass the shape up to the base decorator
	}

	@Override
	public void draw() {
		// 1. Do the original core behavior
		decoratedShape.draw();
		// 2. Add the new dynamic behavior
		setRedBorder(decoratedShape);
	}

	private void setRedBorder(Shape decoratedShape) {
		System.out.println(" -> Adding a Red Border to the Canvas!");
	}
}