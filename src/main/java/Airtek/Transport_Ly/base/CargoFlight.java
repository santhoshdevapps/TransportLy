package Airtek.Transport_Ly.base;
/*
 * this class contains cargo detail object
 */
public class CargoFlight extends FlightDetail {

	public CargoFlight(int flightNumber, String arrival, int day) {
		super(flightNumber, arrival, day);
	}

	private int boxCapacity = 0;

	public int getFlightCapacity() {

		return this.boxCapacity;
	}

	public void setFlightCapacity(int capacity) {
		this.boxCapacity = capacity + 1;
	}
}
