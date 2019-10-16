import java.util.Scanner;

public class Exercicio4 {
	public Scanner sc = new Scanner(System.in);
	
	public void exercicio1() {
		int senha;
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
	}
	
	public void exercicio2() {
		double x,y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		while(x != 0 || y != 0) {

			
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if(x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			else if(x<0 && y>0) {
				System.out.println("Segundo");
			}
			else if(x<0 && y<0) {
				System.out.println("Terceiro");
			}
			
			x = sc.nextDouble();
			y = sc.nextDouble();
		}
	}
	
	public void exercicio3() {
		int code,gasoline=0,alcohol=0,diesel=0;
		code = sc.nextInt();
		
		while(code != 4) {
			if(code == 1) {
				gasoline++;
			}
			else if(code == 2) {
				alcohol++;
			}
			else if(code == 3) {
				diesel++;
			}
			else {
				System.out.println("Código indevido");
			}
			code = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("GASOLINA " +gasoline);
		System.out.println("ÁLCOOL " +alcohol);
		System.out.println("DIESEL " +diesel);
	}
}
