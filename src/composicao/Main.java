package composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import composicao.enuns.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter Client Data");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth Date: ");
		Date birthDate = sdf.parse(sc.next());	
		Client client = new Client(name, email, birthDate);
		
		
		System.out.println("Enter Order data:");
		System.out.print("Status :");
		String orderStatus = sc.next();
		Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

		System.out.print("How many items to this order?");
		int quantityItens = sc.nextInt();
		for(int i=1;i<=quantityItens;i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product Name: ");
			String nameProduct = sc.next();
			System.out.print("Product Price: ");
			double producPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(nameProduct, producPrice);
			OrderItem orderItem = new OrderItem(quantity, product);
			order.addItem(orderItem);
		}
		
		System.out.println("Order Sumary:");
		System.out.print("Order Moment:");
		System.out.println(sdf.format(order.getMoment()));
		System.out.print("Order status:");
		System.out.println(order.getOrderStatus());
		System.out.print("Client:");
		System.out.println(order.getClient());
		System.out.println("Order Itens: ");
		
		for(OrderItem x: order.getList()) {
			System.out.println(x);
		}
		System.out.print("Total Price:");
		System.out.printf("%.2f",order.total());
	}

}
