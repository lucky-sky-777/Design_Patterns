package baitap.creational_patterns.prototype.b.model;

public class Person {
	public String name;

	public Person(String name) {
		this.name = name;
	}

	public Person(Person other) {
		this.name = other.name;
	}
}