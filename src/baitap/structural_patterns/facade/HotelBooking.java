package baitap.structural_patterns.facade;

public class HotelBooking {
	public void reserveRoom(String destination, int nights) {
		System.out.println("Hotel reserved in " + destination + " for " + nights + " nights");
	}
}