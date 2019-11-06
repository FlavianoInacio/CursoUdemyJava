package abstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> lista = new ArrayList();
		System.out.print("Enter the number of tax players: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Tax Player #"+i+" data:");
			System.out.print("Individual or Company (i/c)?");
			char opcao = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name:");
			String nome = sc.nextLine();
			System.out.print("Anual Icome:");
			double anualIcome = sc.nextDouble();
			
			if(opcao == 'i') {
				System.out.print("Health Expenditures:");
				double healthExpenditures = sc.nextDouble();
				lista.add(new PessoaFisica(nome, anualIcome, healthExpenditures));
			}
			if(opcao == 'c') {
				System.out.print("Number of Employees:");
				int numberEmployees = sc.nextInt();
				lista.add(new PessoaJuridica(nome, anualIcome, numberEmployees));
			}
		}
		System.out.println();
		System.out.println("Taxes Paid");
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}
	}

}
