package baitap.builder.complex.model;

import java.util.ArrayList;
import java.util.List;

public class Storey {

	private List<Room> rooms = new ArrayList<>();

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public List<Room> getRooms() {
		return rooms;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Storey{");
		sb.append("rooms=").append(rooms);
		sb.append('}');
		return sb.toString();
	}

}