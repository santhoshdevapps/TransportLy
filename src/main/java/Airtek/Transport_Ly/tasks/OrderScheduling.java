package Airtek.Transport_Ly.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.json.simple.JSONObject;

import Airtek.Transport_Ly.base.CargoFlight;
import Airtek.Transport_Ly.base.OrderDetail;
import Airtek.Transport_Ly.utils.Constants;
import Airtek.Transport_Ly.utils.OrderComparator;
import Airtek.Transport_Ly.utils.Parser;

public class OrderScheduling {

	OrderDetail orderDetail;
	Parser parse;

	public void scheduling() {
		// user story - 2
		

		// parse the json file to json object
		parse = new Parser();
		JSONObject orderDetailJSON = parse.parse(Constants.FILE_PATH + Constants.FILE_NAME);

		ArrayList<OrderDetail> orders = new ArrayList<>();

		for (Object keys : orderDetailJSON.keySet()) {

			String orderNumber = String.valueOf(keys);
			String destination = (String) ((JSONObject) orderDetailJSON.get(keys)).get("destination");
			Integer priority = Integer.parseInt(String.valueOf(keys).split("-")[1]);

			orderDetail = new OrderDetail(orderNumber, destination, priority);
			orders.add(orderDetail);
		}

		Collections.sort(orders, new OrderComparator());
		;
		for (OrderDetail order : orders) {

			if (Arrays.asList(Constants.ARRIVAL).contains(order.getDestination())) {

				for (CargoFlight flightDetail : FlightScheduling.schedule) {

					if (order.getDestination().contentEquals(flightDetail.getArrival())
							&& flightDetail.getFlightCapacity() < Constants.FLIGHT_CAPACITY) {

						flightDetail.setFlightCapacity(flightDetail.getFlightCapacity());

						System.out.println("order: " + order.getOrderNumber() + ", flightNumber: "
								+ flightDetail.getFlightNumber() + ", departure: " + flightDetail.getDeparture()
								+ ", arrival: " + flightDetail.getArrival() + ", day: " + flightDetail.getDay());
						break;
					}

				}
			} else {
				System.out.println("order: " + order.getOrderNumber() + ", flightNumber: not scheduled");

			}

		}

	}
}
