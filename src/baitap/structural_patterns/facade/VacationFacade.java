package baitap.structural_patterns.facade;

public class VacationFacade {
	// The Façade holds references to the complex subsystems
	private FlightArrangement flightArrangement;
	private HotelBooking hotelBooking;
	private CarRental carRental;

	public VacationFacade() {
		this.flightArrangement = new FlightArrangement();
		this.hotelBooking = new HotelBooking();
		this.carRental = new CarRental();
	}

	// The simplified, unified method for the client
	public void bookCompleteVacation(String destination, String date, int duration) {
		System.out.println("--- Starting Vacation Booking Process ---");

		flightArrangement.bookFlight(destination, date);
		hotelBooking.reserveRoom(destination, duration);
		carRental.rentCar(destination, duration);

		System.out.println("--- Vacation Booking Complete! ---");
	}
}