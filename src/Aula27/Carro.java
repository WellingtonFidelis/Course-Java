// Methods with return

package Aula27;

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
	
	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return capacidadeCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}
}
