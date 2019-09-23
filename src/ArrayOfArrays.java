import java.util.Scanner;

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
		
		// class video 20 part 3
		
		//Matriz tridimensional
		
		int[][][] matrizTridimensional = new int [3][3][3];
		// atribuir a soma dos índices para a matriz
		for (int i=0; i < matrizTridimensional.length; i++) {
			for (int j=0; j < matrizTridimensional[i].length; j++) {
				for (int k=0; k < matrizTridimensional[i][j].length; k++) {
					matrizTridimensional[i][j][k] = i + j + k;
				}
			}
		}
		
		// soma de todos os valores da matriz, soma dos pare e dos impares
		int somaTotal = 0, somaPares = 0, somaImpares = 0;
		for (int i=0; i < matrizTridimensional.length; i++) {
			for (int j=0; j < matrizTridimensional[i].length; j++) {
				for (int k=0; k < matrizTridimensional[i][j].length; k++) {
					somaTotal += matrizTridimensional[i][j][k];
					
					if ((matrizTridimensional[i][j][k] % 2) == 0) {
						somaPares += matrizTridimensional[i][j][k];
					} else {
						somaImpares += matrizTridimensional[i][j][k];
					}
				}
			}
		}
		
		System.out.println("A soma total é = " + somaTotal);
		System.out.println("A soma dos números pares é = " + somaPares);
		System.out.println("A soma dos números impares é = " + somaImpares);
		
		// class video 20 part 4
		// Matrizes Irregulares
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String [][] nomesFilhos = new String [numEntrevistados][];
		
		for (int i=0; i < nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos: ");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for (int j=0; j < nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho " + (j+1) + ": ");
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for (int i=0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + "filhos.");
			for (int j=0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}
	// lista de exercicios
	// http://www.slidshare.net/loianeg/curso-java-basico-exercicios-aula-20
}
