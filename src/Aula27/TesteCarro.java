// Methods with return

package Aula27;

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
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numeroPassageiros = 4;
		fusca.capacidadeCombustivel = 30;
		fusca.consumoCombustivel = 0.15;

		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		
		van.exibirAutonomia();
		
		double autonomia = fusca.obterAutonomia();
		
		System.out.println("A autonomia do carro Ã© " + autonomia);
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("Para percorrer 10 km é preciso " + qtdCombustivel10 + " de combustivel.");
		System.out.println("Para percorrer 15 km é preciso " + qtdCombustivel15 + " de combustivel.");
		
		// Exercícios: http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-25-a-27
	}
}
