package baitap.creational_patterns.prototype.b;

import baitap.creational_patterns.prototype.b.model.Person;
import baitap.creational_patterns.prototype.b.model.Rabbit;

public class Main {
	public static void main(String[] args) {
		Person bob = new Person("Bob");
		Rabbit originalRabbit = new Rabbit(3, bob);

		Rabbit clonedRabbit = new Rabbit(originalRabbit);

		clonedRabbit.owner.name = "Alice";

		System.out.println("Original owner: " + originalRabbit.owner.name);
		System.out.println("Clone owner: " + clonedRabbit.owner.name);
	}
}