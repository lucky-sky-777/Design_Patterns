package baitap.structural_patterns.adapter;

public class UKCarPriceAdapter implements PriceCalculator {
	private UKCarPriceCalculator ukCalculator;
	private static final double GBP_TO_USD_RATE = 1.25;

	public UKCarPriceAdapter(UKCarPriceCalculator ukCalculator) {
		this.ukCalculator = ukCalculator;
	}

	@Override
	public double calculatePrice() {
		double priceInGBP = ukCalculator.getPrice();
		return priceInGBP * GBP_TO_USD_RATE;
	}
}