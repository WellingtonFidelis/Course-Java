package aula25a27_Exercicio1;

public class Lampada {
	String modelo, tensao, cor;
	String[] tipos;
	int potencia, voltagem;
	boolean estado;
	
	
	public void ligar() {
		estado = true;
	}
	
	public void desligar() {
		estado = false;
	}
	
	void mostrarEstado() {
		if (estado) {
			System.out.println(" A lampada está ligada!");
		} else {
			System.out.println(" A lampada está desligada!");
		}
	}
	
	void ligarDesligar() {
		if (estado) {
			ligar();
		} else {
			desligar();
		}
	}
}
