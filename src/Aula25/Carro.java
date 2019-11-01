// Simple methods

package Aula25;

public class Carro {
	// atributos
	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capacidadeCombustivel*consumoCombustivel + " km.");
	}
}
