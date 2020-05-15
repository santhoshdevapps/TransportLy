package Airtek.Transport_Ly.base;

import Airtek.Transport_Ly.tasks.FlightScheduling;
import Airtek.Transport_Ly.tasks.OrderScheduling;

public class Results {

	public static void main(String[] args) {

		FlightScheduling flightScheduling = new FlightScheduling();
		flightScheduling.scheduling();
		
		OrderScheduling orderScheduling = new OrderScheduling();
		orderScheduling.scheduling();
	}

	
}
