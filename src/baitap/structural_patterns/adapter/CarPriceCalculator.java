package baitap.structural_patterns.adapter;

public class CarPriceCalculator implements PriceCalculator {
	int age;

	public CarPriceCalculator(int age) {
		this.age = age;
	}

	@Override
	public double calculatePrice() {
		return Math.max(20000 - (age * 1000), 1000); // Random USD formula
	}
}