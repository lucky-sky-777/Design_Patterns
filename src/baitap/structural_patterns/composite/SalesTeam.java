package baitap.structural_patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesTeam implements Payee {
	// Instead of separate lists for Managers and Salespeople,
	// we just hold a list of the common interface.
	private List<Payee> payees = new ArrayList<>();

	// Using Varargs to easily add multiple payees at once
	public void addPayees(Payee... newPayees) {
		payees.addAll(Arrays.asList(newPayees));
	}

	@Override
	public void payExpenses(int amount) {
		System.out.println("--- Paying Sales Team ---");
		// The Composite delegates the task to all its children
		for (Payee payee : payees) {
			payee.payExpenses(amount);
		}
	}
}