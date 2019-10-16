import java.util.Scanner;

public class Exercicio5 {
	public Scanner sc = new Scanner(System.in);
	
	public void exercicio1() {
		int value;
		
		value = sc.nextInt();
		
		for(int i=1; i<=value;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
	public void exercicio2() {
		int n,x,in=0,out=0;
		
		n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			x = sc.nextInt();
			if(x>=10 && x<=20) {
				in++;
			}
			else {
				out++;
			}
		}
		System.out.println(in + " IN ");
		System.out.println(out + " OUT ");
	}
	
	public void exercicio3() {
		int n;
		double value1,value2,value3,media;
		
		n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			value1 = sc.nextDouble();
			value2 = sc.nextDouble();
			value3 = sc.nextDouble();
			
			media = ((value1*2) + (value2*3) + (value3*5))/10;
			
			System.out.println(media);
		}
	}
	
	public void exercicio4() {
		int n;
		double value1,value2,div=0;
		
		n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			value1 = sc.nextDouble();
			value2 = sc.nextDouble();
			
			if(value2 ==0) {
				System.out.println("Divisão impossível");
			}
			else {
				div = value1/value2;
				System.out.println(div);
			}
			
		}
	}


}
