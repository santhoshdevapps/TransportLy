package Airtek.Transport_Ly.tasks;

import java.util.ArrayList;

import Airtek.Transport_Ly.base.CargoFlight;
import Airtek.Transport_Ly.utils.Constants;

public class FlightScheduling {

	int flightNumber = 1;
	static ArrayList<CargoFlight> schedule;

	public void scheduling() {

		schedule = new ArrayList<CargoFlight>();

		for (int day = 1; day <= Constants.NO_OF_DAYS_SCHEDULED; day++) {
			System.out.println("\nDAY" + day);

			for (int j = 1; j <= Constants.NO_OF_FLIGHT_AVAILABLE; j++) {

				CargoFlight flightDetail = new CargoFlight(flightNumber++, Constants.ARRIVAL[j - 1], day);
				schedule.add(flightDetail);

				System.out.println(
						"Flight: " + flightDetail.getFlightNumber() + ", departure: " + flightDetail.getDeparture()
								+ ", arrival: " + flightDetail.getArrival() + ", day: " + flightDetail.getDay());
			}
		}

		System.out.println("--------------------------------------------------- \n");

	}

}
