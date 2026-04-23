package baitap.structural_patterns.bridge;

public class Main {
	public static void main(String[] args) {
		Shape redCircle = new Circle(new Red());
		Shape blueTriangle = new Triangle(new Blue());
		Shape greenCircle = new Circle(new Green());

		System.out.println("--- Rendering Canvas ---");
		redCircle.draw();
		blueTriangle.draw();
		greenCircle.draw();
	}
}