package baitap.builder.complete;

import baitap.builder.complete.builder.BedroomBuilder;
import baitap.builder.complete.builder.sub_builder.Bedroom1Builder;
import baitap.builder.complete.builder.sub_builder.Bedroom2Builder;

public class Main {
	public static void main(String[] args) {
		BedroomBuilder bedroomBuilder;
		Bedroom bedroom;

		bedroomBuilder = new Bedroom1Builder();
		bedroomBuilder.buildField3();
		bedroomBuilder.buildField6();
		bedroomBuilder.buildField7();

		bedroom = bedroomBuilder.build();
		System.out.println(bedroom);

		bedroomBuilder = new Bedroom2Builder();
		bedroomBuilder.buildField3();
		bedroomBuilder.buildField6();
		bedroomBuilder.buildField7();

		bedroom = bedroomBuilder.build();
		System.out.println(bedroom);
	}
}