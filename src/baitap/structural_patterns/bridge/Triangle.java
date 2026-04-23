package baitap.structural_patterns.bridge;

public class Triangle extends Shape {
	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.print("Drawing a Triangle -> ");
		color.applyColor(); // Delegating the color behavior
	}
}