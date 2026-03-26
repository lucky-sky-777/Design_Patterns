package baitap.builder.complex.bedroombuilder.sub_bedroombuilder;

import baitap.builder.complex.model.Bedroom;
import baitap.builder.complex.bedroombuilder.BedroomBuilder;

public class Bedroom2Builder implements BedroomBuilder {

	private final Bedroom bedroom;

	public Bedroom2Builder() {
		this.bedroom = new Bedroom();
	}

	@Override
	public void buildField3() {
		bedroom.setField3("2f3");
	}

	@Override
	public void buildField6() {
		bedroom.setField6("2f6");
	}

	@Override
	public void buildField7() {
		bedroom.setField7("2f7");
	}

	@Override
	public Bedroom build() {
		return bedroom;
	}

}