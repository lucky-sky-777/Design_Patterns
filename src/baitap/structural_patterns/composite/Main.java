package baitap.structural_patterns.composite;

public class Main {
	public static void main(String[] args) {
		// 1. Create individuals
		Manager jane = new Manager("Jane");
		Salesperson bob = new Salesperson("Bob", jane);
		Salesperson alice = new Salesperson("Alice", jane);

		// 2. Create the composite group and use Varargs to add members
		SalesTeam regionalTeam = new SalesTeam();
		regionalTeam.addPayees(jane, bob, alice);

		// 3. We can pay an individual directly...
		System.out.println("Paying an individual:");
		bob.payExpenses(150);

		// 4. ...or we can pay the whole group using the EXACT same method!
		System.out.println("\nPaying the composite group:");
		regionalTeam.payExpenses(200);
	}
}