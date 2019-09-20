
public class ArrayOfArrays {

	public static void main(String[] args) {
		// 
		
		double [] [] notasAlunos = new double [2][4];
		double soma=0;
		
		// data input
		// first student
		notasAlunos [0] [0] = 10;
		notasAlunos [0] [1] = 7;
		notasAlunos [0] [2] = 8;
		notasAlunos [0] [3] = 9.5;
		// seconde student
		notasAlunos [1] [0] = 9;
		notasAlunos [1] [1] = 8;
		notasAlunos [1] [2] = 7;
		notasAlunos [1] [3] = 9;
		
		// data output
		
		for (int i = 0; i < notasAlunos.length; i++) {
			// System.out.println(notasAlunos[i] + " ");
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + "	 ");
			}
			System.out.println(" "); // pulando uma linha
		}
		
		notasAlunos[1][3] = 8; // change the value of second student of fourth test
		
		System.out.println(" "); // pulando uma linha
		
		for (int i = 0; i < notasAlunos.length; i++) {
			// System.out.println(notasAlunos[i] + " ");
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + "	 ");
			}
			System.out.println(" ");
		}
		
		System.out.println(" "); // pulando uma linha
		
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos [i][j];
			}
			
			System.out.println("Média do aluno " + (i+1) + " é: " + (soma/4));
		}
		
		System.out.println(" "); // pulando uma linha
		
		double [][] notaAlunos1 = {{7, 8, 9, 10},{10, 9, 8, 7},{1, 2, 3, 4}};
		
		for (int i = 0; i < notaAlunos1.length; i++) {
			// System.out.println(notasAlunos[i] + " ");
			for (int j = 0; j < notaAlunos1[i].length; j++) {
				System.out.print(notaAlunos1[i][j] + "	 ");
			}
			System.out.println(" ");
		}
		
		// Assitir a continuação da aula: https://www.youtube.com/watch?v=99u1tAbYcww
	}
	
}
