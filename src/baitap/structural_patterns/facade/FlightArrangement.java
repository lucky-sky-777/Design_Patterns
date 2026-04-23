package baitap.structural_patterns.facade;

public class FlightArrangement {
	public void bookFlight(String destination, String date) {
		System.out.println("Flight booked to " + destination + " for " + date);
	}
}