package aula25a27_Exercicio3;

import java.util.Scanner;

public class AppTesteAluno {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		// input data
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		aluno.name = scan.nextLine();
		
		System.out.println("Digite a matricula do aluno:");
		aluno.curso = scan.nextLine();
		
		System.out.println("Digite a matricula do aluno:");
		aluno.matricula = scan.nextLine();
		
		// aluno.disciplina = new String[3];
		for (int i=0; i<aluno.disciplina.length; i++) {
			System.out.println("Digite o nome da " + (i+1) + " disciplina:");
			aluno.disciplina[i] = scan.nextLine();
		}
		
		for (int i=0; i < aluno.notas.length; i++) {
			System.out.println("obtendo as notas da disciplina" + aluno.disciplina[i]);
			
			for (int j=0; j < aluno.notas[i].length; j++) {
				System.out.println("digite a nota " + (j+1));
				aluno.notas[i][j] = scan.nextDouble();
			}
		}
		
		aluno.mostrarInfoAluno();
		
		for (int i=0; i < aluno.disciplina.length; i++) {
			if (aluno.verificarAprovacao(i)) {
				System.out.println("Disciplina " + aluno.disciplina[i] + " --> foi Aprovado!");
			} else {
				System.out.println("Disciplina " + aluno.disciplina[i] + " --> foi Reprovado");
			}
		}
	}

}
