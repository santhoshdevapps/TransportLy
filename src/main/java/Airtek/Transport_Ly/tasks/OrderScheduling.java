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

/**
 * User Story - 2 This is used to generate flight itineraries by scheduling a
 * batch of orders.
 * @author santhoshdamodharan
 */
public class OrderScheduling {

	OrderDetail orderDetail;
	Parser parse;

	public void scheduling() {

		// parse the json file to json object
		parse = new Parser();
		JSONObject orderDetailJSON = parse.parse(Constants.FILE_PATH + Constants.FILE_NAME);

		ArrayList<OrderDetail> orders = new ArrayList<>();

		// iterate the json object and get details
		for (Object keys : orderDetailJSON.keySet()) {
			if (!keys.toString().isEmpty()) {

				String orderNumber = String.valueOf(keys);
				String destination = (String) ((JSONObject) orderDetailJSON.get(keys)).get("destination");
				Integer priority = Integer.parseInt(String.valueOf(keys).split("-")[1]);

				orderDetail = new OrderDetail(orderNumber, destination, priority);
				orders.add(orderDetail);
			} else {
				// key is not present
			}
		}
		// Sort the orders Array to ascending based on order number
		Collections.sort(orders, new OrderComparator());
		;
		for (OrderDetail order : orders) {

			if (Arrays.asList(Constants.ARRIVAL).contains(order.getDestination())) {

				for (CargoFlight flightDetail : FlightScheduling.schedule) {

					if (order.getDestination().contentEquals(flightDetail.getArrival())
							&& flightDetail.getFlightCapacity() < Constants.FLIGHT_CAPACITY) {

						flightDetail.setFlightCapacity(flightDetail.getFlightCapacity());
						// Print the output
						System.out.println("order: " + order.getOrderNumber() + ", flightNumber: "
								+ flightDetail.getFlightNumber() + ", departure: " + flightDetail.getDeparture()
								+ ", arrival: " + flightDetail.getArrival() + ", day: " + flightDetail.getDay());
						break;
					}

				}
			} else {
				// Show the result when flight is not scheduled
				System.out.println("order: " + order.getOrderNumber() + ", flightNumber: not scheduled");

			}

		}

	}
}
