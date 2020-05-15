package Airtek.Transport_Ly.base;
/**
 * This class contains the order object
 * @author santhoshdamodharan
 *
 */
public class OrderDetail {
	private String destination;
	private Integer priority;
	private String orderNumber;

	public OrderDetail(String orderNumber, String destination, Integer priority) {
		this.orderNumber = orderNumber;
		this.destination = destination;
		this.priority = priority;

	}

	public String getOrderNumber() {

		return this.orderNumber;
	}

	public String getDestination() {

		return this.destination;
	}

	public Integer getPriority() {

		return this.priority;
	}

}
