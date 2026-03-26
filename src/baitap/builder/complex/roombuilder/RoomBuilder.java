package baitap.builder.complex.roombuilder;

import baitap.builder.complex.model.Room;

public interface RoomBuilder {
	void buildBedroom();
	void buildBathroom();
	Room build();
}