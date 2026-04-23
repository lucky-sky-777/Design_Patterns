package baitap.structural_patterns.bridge;

public abstract class Shape {
	// Composition: The Bridge to the Color hierarchy
	protected Color color;

	// The constructor forces all shapes to be instantiated with a color
	public Shape(Color color) {
		this.color = color;
	}

	public abstract void draw();
}