package baitap.creational_patterns.prototype.b.model;

public class Rabbit {
	int age;
	public Person owner;

	public Rabbit(int age, Person owner) {
		this.age = age;
		this.owner = owner;
	}

	public Rabbit(Rabbit other) {
		this.age = other.age;
		this.owner = new Person(other.owner);
	}
}