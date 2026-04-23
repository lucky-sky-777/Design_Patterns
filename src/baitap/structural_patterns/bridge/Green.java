package baitap.structural_patterns.bridge;

public class Green implements Color {
	@Override
	public void applyColor() {
		System.out.println("Applying Green dye");
	}
}