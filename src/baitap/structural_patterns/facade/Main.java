package baitap.structural_patterns.facade;

public class Main {
	public static void main(String[] args) {
		String dest = "Hawaii";
		String date = "2026-05-10";
		int duration = 7;

		// ==========================================
		// THE COMPLEX WAY (Without Façade)
		// The client has to know about and manage all 3 services.
		// ==========================================
		System.out.println("Booking the hard way:");
		FlightArrangement flight = new FlightArrangement();
		HotelBooking hotel = new HotelBooking();
		CarRental car = new CarRental();

		flight.bookFlight(dest, date);
		hotel.reserveRoom(dest, duration);
		car.rentCar(dest, duration);

		System.out.println("\n");

		// ==========================================
		// THE FAÇADE WAY
		// The client only talks to the single, simple interface.
		// ==========================================
		System.out.println("Booking with the Façade:");
		VacationFacade vacationAgent = new VacationFacade();
		vacationAgent.bookCompleteVacation(dest, date, duration);
	}
}