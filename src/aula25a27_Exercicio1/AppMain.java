package aula25a27_Exercicio1;

public class AppMain {

	public static void main(String[] args) {
		
		//after to create of class lampada, we can to instance
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		lampada.mostrarEstado();
		
		lampada.desligar();
		lampada.mostrarEstado();
		
		lampada.ligarDesligar();
	}

}
