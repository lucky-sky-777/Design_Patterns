package baitap.builder.complex.bathroombuilder.sub_bathroombuilder;

import baitap.builder.complex.bathroombuilder.BathroomBuilder;
import baitap.builder.complex.model.Bathroom;

public class Bathroom2Builder implements BathroomBuilder {

	private final Bathroom bathroom;

	public Bathroom2Builder() {
		this.bathroom = new Bathroom();
	}

	@Override
	public void buildField3() {
		bathroom.setField3("2f3");
	}

	@Override
	public void buildField6() {
		bathroom.setField6("2f6");
	}

	@Override
	public void buildField7() {
		bathroom.setField7("2f7");
	}

	@Override
	public Bathroom build() {
		return bathroom;
	}

}