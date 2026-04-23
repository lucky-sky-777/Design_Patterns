package baitap.creational_patterns.builder.complex.roombuilder;

import baitap.creational_patterns.builder.complex.model.Room;

public interface RoomBuilder {
	void buildBedroom();
	void buildBathroom();
	Room build();
}