package baitap.creational_patterns.builder.complex.bedroombuilder;

import baitap.creational_patterns.builder.complex.model.Bedroom;

public interface BedroomBuilder {
	void buildField3();
	void buildField6();
	void buildField7();
	Bedroom build();
}