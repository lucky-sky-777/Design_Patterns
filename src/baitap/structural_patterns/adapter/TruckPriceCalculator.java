package baitap.structural_patterns.adapter;

public class TruckPriceCalculator implements PriceCalculator {
	int age;

	public TruckPriceCalculator(int age) {
		this.age = age;
	}

	@Override
	public double calculatePrice() {
		return Math.max(50000 - (age * 2000), 5000); // Random USD formula
	}
}