import java.util.Random;

public class aula20_ex1 {

	public static void main (String[] args) {
		Random gerador = new Random(9);
		int[][] A = new int [4][4];
		
		for (int i=0; i < A.length; i++) {
			for (int j=0; j < A[i].length; j++) {
				A[i][j] = gerador.nextInt(9);
			}
		}
		
		for (int i=0; i < A.length; i++) {
			for (int j=0; j < A[i].length; j++) {
				System.out.print(A[i][j] + "     ");
			}
			System.out.println(" ");
		}
		
		int maior = A[0][0];
		int linha = 0, coluna = 0;
		
		for (int i=0; i < A.length; i++) {
			for (int j=0; j < A[i].length; j++) {
				if (A[i][j] >= maior) {
					maior = A[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		System.out.println("O maior numero é " + maior + " e esta na " + (linha+1) + " linha e " + (coluna+1) + " coluna");
	}
}
