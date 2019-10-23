import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		// 
		int[] notas = new int[10];
		
		Random random = new Random();
		//input numbers random
		for (int i=0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		// print numbers
		for (int i=0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(nota);
		}
		
		System.out.println("Usando o For Each!");
		
		for (int nota : notas) {
			System.out.println(nota);
		}
		
		// example 02
		
		System.out.println("Example with Array of Arrays");
		
		double[][] notasAlunos = new double [2][2];
		
		notasAlunos [0][0] = 10;
		notasAlunos [0][1] = 5;
		
		notasAlunos [1][0] = 7;
		notasAlunos [1][1] = 9;
		
		for (double[] notaAluno : notasAlunos) {
			for (double nota : notaAluno) {
				System.out.print(nota + " ");
			}
			System.out.println();
		}
				
	}

}
