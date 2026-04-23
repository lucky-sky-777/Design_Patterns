package baitap.creational_patterns.prototype.a.model;

import baitap.creational_patterns.prototype.a.Prototype;

public class Rabbit implements Prototype<Rabbit> {

	public int age;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Rabbit{");
		sb.append("age=").append(age);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public Rabbit clone() {
		Rabbit clone;
		try {
			clone = (Rabbit) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
		return clone;
	}

}