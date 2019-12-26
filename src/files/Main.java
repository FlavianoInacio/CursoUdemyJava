package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList();
		String path = sc.nextLine();
		File file = new File(path);
		sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String[] tempArray = sc.nextLine().split(",");
			products.add(new Product(tempArray[0], Double.parseDouble(tempArray[1]), Integer.parseInt(tempArray[2])));
			
		}

	}

}
