package aula25a27_Exercicio3;

import java.util.Scanner;

public class AppTesteAluno {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		// input data
		System.out.println("Digite o nome do aluno:");
		Aluno.nome = scan.nextLine();
	}

}
