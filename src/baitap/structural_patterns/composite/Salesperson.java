package baitap.structural_patterns.composite;

public class Salesperson implements Payee {
	private String name;
	private Manager manager; // Who they report to

	public Salesperson(String name, Manager manager) {
		this.name = name;
		this.manager = manager;
	}

	@Override
	public void payExpenses(int amount) {
		System.out.println("Salesperson " + name + " has been paid $" + amount);
	}
}