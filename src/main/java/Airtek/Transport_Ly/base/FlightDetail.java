package Airtek.Transport_Ly.base;

import Airtek.Transport_Ly.utils.Constants;

public class FlightDetail {
	private int flightNumber;
	private String departure = Constants.DEPARTURE;
	private String arrival;
	private int day;

	public FlightDetail(int flightNumber, String arrival, int day) {
		this.flightNumber = flightNumber;
		this.arrival = arrival;
		this.day = day;
	}

	public int getFlightNumber() {
		return this.flightNumber;
	}

	public String getDeparture() {
		return this.departure;
	}

	public String getArrival() {
		return this.arrival;
	}

	public int getDay() {
		return this.day;
	}
}
