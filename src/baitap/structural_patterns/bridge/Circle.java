package baitap.structural_patterns.bridge;

public class Circle extends Shape {
	public Circle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Drawing a Circle -> ");
		color.applyColor(); // Delegating the color behavior
	}
}