package baitap.structural_patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<PriceCalculator> vehicles = new ArrayList<>();

		vehicles.add(new CarPriceCalculator(3));
		vehicles.add(new TruckPriceCalculator(5));

		UKCarPriceCalculator foreignCalc = new UKCarPriceCalculator(3);
		vehicles.add(new UKCarPriceAdapter(foreignCalc));

		for (PriceCalculator vehicle : vehicles) {
			System.out.println("Price in USD: $" + vehicle.calculatePrice());
		}
	}
}