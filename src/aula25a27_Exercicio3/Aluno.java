package aula25a27_Exercicio3;

public class Aluno {
	private String name;
	private String matricula;
	private String dataNascimento;
	private String Curso;
	private String[][] disciplina = new String[2][3];
	
	//-------------------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	}
	public String[][] getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String[][] disciplina) {
		this.disciplina = disciplina;
	}
	//-------------------------------------------------
	public void testeAprovado(double nota1, double nota2, String resultado) {
		if((nota1 + nota2)/2 >= 7) {
			resultado = "Aprovado";
		} else {
			resultado = "Reprovado";
		}
	}
}
