import java.util.Locale;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class Exercicios02 {
	public Scanner sc = new Scanner(System.in);
	
	public void exercicio1() {
		int value1;
		int value2;
		int sum;
		System.out.println("Digite um valor");
		value1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite um valor");
		value2 = sc.nextInt();
		sum = value1+value2;
		System.out.println("SOMA = "+ sum);
		sc.close();
	}
	
	public  void exercicio2() {
		double raio;
		double pi = 3.14159;
		double area;
		System.out.println("Digite o valor do raio");
		raio = sc.nextDouble();
		area = pi*(Math.pow(raio, 2));
		System.out.printf("�rea = %.4f", area);
		sc.close();
		
	}
	
	public  void exercicio3() {
		int a,b,c,d,diferenca;
		a = sc.nextInt();
		sc.nextLine();
		b = sc.nextInt();
		sc.nextLine();
		c = sc.nextInt();
		sc.nextLine();
		d = sc.nextInt();
		diferenca = (a*b-c*d);
		System.out.println("DIFEREN�A = " + diferenca);
		sc.close();
	}

	public void exercicio4() {
		int number;
		double salary;
		int workWours;
		double hourValueWork;
		number = sc.nextInt();
		workWours = sc.nextInt();
		hourValueWork = sc.nextDouble();
		salary = hourValueWork*workWours;
		System.out.println("NUMBER = "+number);
		System.out.println("SALARY = "+salary);
		sc.close();
	}
	
	public  void exercicio5() {
		int codPiece1,codPiece2,qtdPiece1,qtdPiece2;
		double valuePiece1,valuePiece2,total;
		codPiece1 = sc.nextInt();
		qtdPiece1 = sc.nextInt();
		valuePiece1 = sc.nextDouble();
		codPiece2 = sc.nextInt();
		qtdPiece2 = sc.nextInt();
		valuePiece2 = sc.nextDouble();
		total = (valuePiece1*qtdPiece1) + (valuePiece2*qtdPiece2);
		System.out.printf("VALOR A PAGAR : %.2f" , total);
		sc.close();
	}
	
	public void exercicio6() {
		double a,b,c,areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaRetangulo;
		double pi = 3.14159;
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		areaTriangulo = (a*c)/2;
		areaCirculo = pi*(Math.pow(c, 2));
		areaTrapezio = ((a+b)/2)*c;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a*b;
		System.out.printf("AREA TRIANGULO = %.3f%n",areaTriangulo);
		System.out.printf("AREA CIRCULO = %.3f%n",areaCirculo);
		System.out.printf("AREA TRAPEZIO = %.3f%n",areaTrapezio);
		System.out.printf("AREA QUADRADO = %.3f%n",areaQuadrado);
		System.out.printf("AREA RETANGULO = %.3f%n",areaRetangulo);
		sc.close();
	}
}
