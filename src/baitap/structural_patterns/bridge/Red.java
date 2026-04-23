package baitap.structural_patterns.bridge;

public class Red implements Color {
	@Override
	public void applyColor() {
		System.out.println("Applying Red dye");
	}
}