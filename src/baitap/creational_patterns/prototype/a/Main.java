package baitap.creational_patterns.prototype.a;

import baitap.creational_patterns.prototype.a.model.Rabbit;

public class Main {
	public static void main(String[] args) {
		Rabbit rabbit1 = new Rabbit();
		rabbit1.age = 99;
		System.out.println(rabbit1);
		Rabbit rabbit2 = rabbit1.clone();
		System.out.println(rabbit2);
	}
}
