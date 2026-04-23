package baitap.structural_patterns.adapter;

public class UKCarPriceCalculator {
	int age;

	public UKCarPriceCalculator(int age) {
		this.age = age;
	}

	public double getPrice() {
		return Math.max(15000 - (age * 800), 800); // Random GBP formula
	}
}