package baitap.builder.simple;

public class BedroomBuilder {

	private String field1;
	private String field2;
	private String field3;
	private String field4;
	private String field5;
	private String field6;
	private String field7;
	private String field8;

	public BedroomBuilder setField1(String field1) {
		this.field1 = field1;
		return this;
	}

	public BedroomBuilder setField2(String field2) {
		this.field2 = field2;
		return this;
	}

	public BedroomBuilder setField3(String field3) {
		this.field3 = field3;
		return this;
	}

	public BedroomBuilder setField4(String field4) {
		this.field4 = field4;
		return this;
	}

	public BedroomBuilder setField5(String field5) {
		this.field5 = field5;
		return this;
	}

	public BedroomBuilder setField6(String field6) {
		this.field6 = field6;
		return this;
	}

	public BedroomBuilder setField7(String field7) {
		this.field7 = field7;
		return this;
	}

	public BedroomBuilder setField8(String field8) {
		this.field8 = field8;
		return this;
	}

	public Bedroom createBedroom() {
		return new Bedroom(
				field1,
				field2,
				field3,
				field4,
				field5,
				field6,
				field7,
				field8
		);
	}
	
}