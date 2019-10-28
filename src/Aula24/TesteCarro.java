package Aula24;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numeroPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro fusca = new Carro();
		van.marca = "Volkswagen";
		van.modelo = "Fusca";
		van.numeroPassageiros = 4;
		van.capacidadeCombustivel = 30;
		van.consumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		
		// homework -> http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-24
		
	}

}
