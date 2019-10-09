import java.util.Random;
import java.util.Scanner;

public class aula20_ex2 {
	// declaration of variables globals and statics
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// declaration of variables locals and constants
		Random gerador = new Random(9);
		int[][] A = new int [10][10];
		
		for (int i=0; i < A.length; i++) {
			for (int j=0; j < A[i].length; j++) {
				A[i][j] = gerador.nextInt(9);
			}
		}
		
		int maior = A[4][0];
		int menor = A[4][0];
		
		for (int i=4; i < 5; i++) {
			for (int j=0; j < A[i].length; j++) {
				if (A[i][j] > maior) {
					maior = A[i][j];
				}
				if (A[i][j] < menor) {
					menor = A[i][j];
				}
			}
		}
		
		System.out.println("o maior valor da linha 5 é " + maior + " e o menor é " + menor );
		
		maior = A[6][0];
		menor = A[6][0];
		
		for (int i=6; i < 7; i++) {
			for (int j=0; j < A[i].length; j++) {
				if (A[i][j] > maior) {
					maior = A[i][j];
				}
				if (A[i][j] < menor) {
					menor = A[i][j];
				}
			}
		}
		
		System.out.println("o maior valor da linha 7 é " + maior + " e o menor é " + menor );
	}

}
