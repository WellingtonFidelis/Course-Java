package Aula30;

public class Carro {

	// atributos
	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	// constructor using parameters
	public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel,
			double consumoCombustivel) {
		// this.marca is the attribute of the class, and 'marca' is the parameters
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	// constructor of super class
	public Carro() { }
	
	
	// constructor only using numeroPassageiros, capacidadeCombustivel and consumoCombustivel
	public Carro(String marca, String modelo, int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
		this.marca = marca;
		this.modelo = marca;
		System.out.println("Calling the constructor with 3 parameters.");
	}

	// constructor using only marca and modelo
	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Calling the constructor with 2 parameters.");
	}

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capacidadeCombustivel*this.consumoCombustivel + " km.");
	}

	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return this.capacidadeCombustivel * this.consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km/ this.consumoCombustivel;
		return qtdCombustivel;
	}

}
