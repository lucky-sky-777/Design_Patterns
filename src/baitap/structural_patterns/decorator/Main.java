package baitap.structural_patterns.decorator;

public class Main {
	public static void main(String[] args) {
		Shape standardCircle = new Circle();

		// We wrap the Circle inside the RedBorderDecorator
		Shape redBorderCircle = new RedBorderDecorator(new Circle());

		System.out.println("--- Normal Canvas Update ---");
		standardCircle.draw();

		System.out.println("\n--- Decorated Canvas Update ---");
		redBorderCircle.draw();
	}
}