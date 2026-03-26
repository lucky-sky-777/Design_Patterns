package baitap.builder.complex.roombuilder.sub_roombuilder;

import baitap.builder.complex.bathroombuilder.BathroomBuilder;
import baitap.builder.complex.bathroombuilder.sub_bathroombuilder.Bathroom1Builder;
import baitap.builder.complex.model.Bathroom;
import baitap.builder.complex.model.Room;
import baitap.builder.complex.model.Bedroom;
import baitap.builder.complex.roombuilder.RoomBuilder;
import baitap.builder.complex.bedroombuilder.BedroomBuilder;
import baitap.builder.complex.bedroombuilder.sub_bedroombuilder.Bedroom1Builder;

public class Room1Builder implements RoomBuilder {

	private Room room;

	public Room1Builder() {
		room = new Room();
	}

	@Override
	public void buildBedroom() {
		BedroomBuilder bedroomBuilder = new Bedroom1Builder();

		bedroomBuilder.buildField3();
		bedroomBuilder.buildField6();
		bedroomBuilder.buildField7();

		Bedroom bedroom = bedroomBuilder.build();
		room.setBedroom(bedroom);
	}

	@Override
	public void buildBathroom() {
		BathroomBuilder bathroomBuilder = new Bathroom1Builder();

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