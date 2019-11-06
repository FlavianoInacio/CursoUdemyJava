package hercanca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println("Products #"+i+" data:	");
			System.out.print("Common, Used, Imported (c/u/i)");
			char opcao = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(opcao == 'c') {
				products.add(new Product(name, price));
			}
			if(opcao == 'u') {
				System.out.print("Mancfatured date (dd/mm/yyyy): ");
				String date = sc.next();
				products.add(new UsedProduct(name, price, sdf.parse(date)));
			}
			if(opcao == 'i') {
				System.out.print("Custoom fee: ");
				double customFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customFee));
			}
			
		}
		System.out.println("PRICE TAGS");
		for (Product product : products) {
			System.out.println(product.pricetag());
		}
	}

}
