package matrix;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int m,n;
		m = sc.nextInt();
		n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=sc.nextInt();
			}
			
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		int opcao = sc.nextInt();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]==opcao) {
					System.out.println("Posição: "+i+","+j);
					if(j-1>=0) {
						System.out.println("Left: "+mat[i][j-1]);	
					}
					if(j+1<n) {
						System.out.println("Right: "+mat[i][j+1]);
					}
					if(i-1>=0) {
						System.out.println("UP: "+mat[i-1][j]);
					}
					if(i+1<m) {
						System.out.println("Down: "+mat[i+1][j]);
					}

				}
			}
			System.out.println();
		}

	}

}
