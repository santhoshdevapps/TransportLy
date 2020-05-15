package Airtek.Transport_Ly.tasks;

import Airtek.Transport_Ly.tasks.FlightScheduling;
import Airtek.Transport_Ly.tasks.OrderScheduling;

/**
 * Main class from where the user stories are called.
 * @author santhoshdamodharan
 */
public class Results {

	public static void main(String[] args) {

		FlightScheduling flightScheduling = new FlightScheduling();
		flightScheduling.scheduling();
		
		OrderScheduling orderScheduling = new OrderScheduling();
		orderScheduling.scheduling();
	}

	
}
