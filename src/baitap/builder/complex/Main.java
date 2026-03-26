package baitap.builder.complex;

import baitap.builder.complex.model.House;
import baitap.builder.complex.model.Room;
import baitap.builder.complex.model.Storey;
import baitap.builder.complex.roombuilder.RoomBuilder;
import baitap.builder.complex.roombuilder.sub_roombuilder.Room1Builder;

public class Main {
	public static void main(String[] args) {
		House house = new House();
		for (int i = 0; i < 2; i++) {
			Storey storey = new Storey();
			for (int j = 0; j < 2; j++) {
				RoomBuilder roomBuilder = new Room1Builder();
				roomBuilder.buildBedroom();
				Room room = roomBuilder.build();
				storey.addRoom(room);
			}
			house.addStorey(storey);
		}
		System.out.println(house);
	}
}