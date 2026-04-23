package baitap.creational_patterns.builder.complex.bathroombuilder;

import baitap.creational_patterns.builder.complex.model.Bathroom;

public interface BathroomBuilder {
	void buildField3();
	void buildField6();
	void buildField7();
	Bathroom build();
}