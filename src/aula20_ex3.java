import java.util.Scanner;

public class aula20_ex3 {
	// declarations of variables statics and globals
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// declarations of variables locals and constants
		
		int[][] A = new int [3][3];
		int pares = 0;
		int impares = 0;
		
		for (int i=0; i < A.length; i++) {
			for (int j=0; j < A[i].length; j++) {
				System.out.println("Digite o valor da linha: " + (i+1) + " da coluna: " + (j+1) + " .");
				A[i][j] = scan.nextInt();
				
				if (Math.floorMod(A[i][j], 2) == 0) {
					pares += 1;
				} else {
					impares += 1;
				}
			}
		}
		
		System.out.println("A quantidade de números pares é: " + pares + " .");
		System.out.println("A quantidade de números ímpares é: " + impares + " .");
	}

}
