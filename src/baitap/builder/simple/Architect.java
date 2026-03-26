package baitap.builder.simple;

public class Architect {
	public static void main(String[] args) {
		Bedroom bedroom = new BedroomBuilder()
				.setField3("f3")
				.setField6("f6")
				.setField7("f7")
				.createBedroom();
		System.out.println(bedroom);
	}
}
