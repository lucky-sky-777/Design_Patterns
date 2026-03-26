package baitap.builder.complex.model;

public class Room {

	private Bedroom bedroom;
	private Bathroom bathroom;

	public void setBedroom(Bedroom bedroom) {
		this.bedroom = bedroom;
	}

	public Bedroom getBedroom() {
		return bedroom;
	}

	public void setBathroom(Bathroom bathroom) {
		this.bathroom = bathroom;
	}

	public Bathroom getBathroom() {
		return bathroom;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Room{");
		sb.append("bedroom=").append(bedroom);
		sb.append('}');
		return sb.toString();
	}

}