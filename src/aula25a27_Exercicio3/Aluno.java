package aula25a27_Exercicio3;

public class Aluno {
	String name;
	String matricula;
	String curso;
	String[] disciplina = new String [3];
	double[][] notas = new double [3][4];
	
	void mostrarInfoAluno () {
		System.out.println("Nome: " + name);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do curso: " + curso);
		
		for (int i=0; i< notas.length; i++) {
			System.out.println("Notas da disciplina " + disciplina[i]);
			for (int j=0; j< notas[i].length; j++) {
				System.out.print(notas[i][j] + "   ");
			}  
			System.out.println();
		}
	}
	
	public boolean verificarAprovacao(int indiceDisciplina) {
		
		double soma = 0;
		
		for (int i=0 ; i < notas[indiceDisciplina].length; i++) {
			soma += notas[indiceDisciplina][i];
		}
		
		double media = soma / 4;
		
		if (media >= 7) {
			return true;
		}
		
		return false; 
		
	}
}
