package composicao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import composicao.enuns.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus orderStatus;
	private Client client;
	private List<OrderItem> list = new ArrayList<OrderItem>();
	
	public Order(Date moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem orderItem) {
		list.add(orderItem);
	}
	public void removeItem(OrderItem orderItem) {
		list.remove(orderItem);
	}
	
	public List<OrderItem> getList() {
		return list;
	}

	public double total() {
		double sum =0;
		for(OrderItem orderItem : list) {
			sum += orderItem.subTotal();
		}
		return sum;
	}
	
}
