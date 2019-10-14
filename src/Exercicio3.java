import java.util.Scanner;

public class Exercicio3 {

	Scanner sc = new Scanner(System.in);
	
	public void exercicio1() {
		int number;
		number = sc.nextInt();
		if(number < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
	}
	
	public void exercicio2() {
		int number;
		number = sc.nextInt();
		if(number%2==0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
	}
	
	public void exercicio3() {
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		if(a%b==0 || b%a==0) {
			System.out.println("SÃO MULTIPLOS");	
		}
		else{
			System.out.println("NÃO MULTIPLOS");
		}
	}
	
	public void exercicio4() {
		int hourInical,hourFinal,duration;
		hourInical =  sc.nextInt();
		hourFinal = sc.nextInt();
		if(hourInical<hourFinal) {
			duration = hourFinal - hourInical;
		}
		else {
			duration = (24-hourInical)+hourFinal;
		}
		System.out.println("O JOGO DUROU "+duration+" HORAS(S)");
	}
	
	public void exercicio5() {
		int code, amount;
		double total =0.0;
		
		code = sc.nextInt();
		amount = sc.nextInt();
		
		if(code == 1) {
			total = 4.0*amount;
		}
		else if(code == 2) {
			total = 4.50*amount;
		}
		else if(code == 3) {
			total = 5.0*amount;
		}
		else if(code == 4) {
			total = 2.0*amount;
		}
		else if(code == 5) {
			total = 1.50*amount;
		}
		else {
			System.out.println("Código incorreto");
		}
		
		System.out.println("Total : R$" + total);
	}
	public void exercicio6() {
		double value;
		value = sc.nextDouble();
		
		if(value >=0 && value <= 25) {
			System.out.println("Intervalo 0 - 25");
		}
		else if(value >25 && value <= 50) {
			System.out.println("Intervalo 25 - 50");
		}
		else if(value >50 && value <= 75) {
			System.out.println("Intervalo 50 - 75");
		}
		else if(value >75 && value <= 100) {
			System.out.println("Intervalo 75 - 1000");
		}
		else {
			System.out.println("Fora do intervalo");
		}
	}
	
	public void exercicio7() {
		double x,y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if(x<0 && y>0) {
			System.out.println("Q2");
		}
		else if(x<0 && y<0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Origem");
		}
	}
	
	public void exercicio8() {
		double salary,tax=0,diff;
		salary = sc.nextDouble();
		if(salary>4500) {
			diff = salary-4500;
			tax += (diff*28)/100;
			salary =+ salary-diff;
		}
		if(salary > 3000) {
			diff = salary-3000;
			tax += (diff*18)/100;
			salary =+ salary-diff;
		}
		if(salary > 2000) {
			diff = salary-2000;
			tax += (diff*8)/100;	
			salary =+ salary-diff;
		}
		else {
			System.out.println("Isento");
		}
		System.out.println("R$ "+tax);
	}
}
