package Aula32;

public class Carro {

	// methods getters and setters are used to see attributes privates in another class
	
	private String marca;
	private String modelo;
	private int numeroPassageiros;
	private double capacidadeCombustivel;
	// when I put private to the attribute he get visible only to this class
	private double consumoCombustivel;

	// when we declared method get we have to return same variable
	public String getMarca() {
		return this.marca;
	}

	// when we declared a method set we have to put the parameter for variable
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getNumeroPassageiros() {
		return this.numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
	
	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	public double getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
}
