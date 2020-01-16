package Aula28a33_Exercicios;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	private String[] diciplinas;
	private double[][] notas;
	
	// the constructor
	
	public Aluno () {
		this.diciplinas = new String[3];
		this.notas = new double [3][4];
	}
	public Aluno(String nome, String matricula, String curso, String[] diciplinas, double[][] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.diciplinas =new String[3];;
		this.notas = new double [3][4];;
	}
	
	// the methods getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(String[] diciplinas) {
		this.diciplinas = diciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}
	
	public void mostarInformação () {
		System.out.println("Nome: " + getNome());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Curso: " + getCurso());
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Notas da disciplina" + getDiciplinas()[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println(getNotas()[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
	public boolean verificarAprovado (int indice) {		
		if (obterMedia(indice) >= 7) {
			return true;
		} else {
			return false;
		}
	}
	
	private double obterMedia (int indice) {
		double soma = 0;
		
		for (int i = 0; i < notas[indice].length; i++) {
			soma += notas[indice] [i];
		}
		
		double media = soma / 2;
		
		return media;
	}
}
