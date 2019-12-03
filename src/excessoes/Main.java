package excessoes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		sc.nextLine();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("WithDraw Limit: ");
		double withDrawLimit = sc.nextDouble();
		Account account = new Account(number, holder, balance, withDrawLimit);
		System.out.println();
		System.out.print("Enter ammount for withdraw: ");
		double amount = sc.nextDouble();
		try {
			account.withDraw(amount);
		} catch (DomainException e) {
			System.out.println("Withdraw Error: "+ e.getMessage());
		}

	}

}
