package baitap.creational_patterns.builder.complex.roombuilder.sub_roombuilder;

import baitap.creational_patterns.builder.complex.bathroombuilder.BathroomBuilder;
import baitap.creational_patterns.builder.complex.bathroombuilder.sub_bathroombuilder.Bathroom2Builder;
import baitap.creational_patterns.builder.complex.model.Bathroom;
import baitap.creational_patterns.builder.complex.model.Room;
import baitap.creational_patterns.builder.complex.model.Bedroom;
import baitap.creational_patterns.builder.complex.roombuilder.RoomBuilder;
import baitap.creational_patterns.builder.complex.bedroombuilder.BedroomBuilder;
import baitap.creational_patterns.builder.complex.bedroombuilder.sub_bedroombuilder.Bedroom2Builder;

public class Room2Builder implements RoomBuilder {

	private Room room;

	public Room2Builder() {
		room = new Room();
	}

	@Override
	public void buildBedroom() {
		BedroomBuilder bedroomBuilder = new Bedroom2Builder();

		bedroomBuilder.buildField3();
		bedroomBuilder.buildField6();
		bedroomBuilder.buildField7();

		Bedroom bedroom = bedroomBuilder.build();
		room.setBedroom(bedroom);
	}

	@Override
	public void buildBathroom() {
		BathroomBuilder bathroomBuilder = new Bathroom2Builder();

		bathroomBuilder.buildField3();
		bathroomBuilder.buildField6();
		bathroomBuilder.buildField7();

		Bathroom bathroom = bathroomBuilder.build();
		room.setBathroom(bathroom);
	}

	@Override
	public Room build() {
		return room;
	}

}