import java.util.Locale;
import java.util.Scanner;

public class Exercicios02 {
	
	public static void exercicio1() {
		int value1;
		int value2;
		int sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor");
		value1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite um valor");
		value2 = sc.nextInt();
		sum = value1+value2;
		System.out.println("SOMA = "+ sum);
		sc.close();
	}
	
	public static void exercicio2() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio;
		double pi = 3.14159;
		double area;
		System.out.println("Digite o valor do raio");
		raio = sc.nextDouble();
		area = pi*(Math.pow(raio, 2));
		System.out.printf("Área = %.4f", area);
		sc.close();
		
	}

}
