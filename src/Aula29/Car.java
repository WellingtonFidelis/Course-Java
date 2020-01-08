package Aula29;

public class Car {

	// atributos
		String marca;
		String modelo;
		int numeroPassageiros;
		double capacidadeCombustivel;
		double consumoCombustivel;
		
		Car () {
			System.out.println("Classe Carro foi inst�nciada.");
			// se o n�mero de passageiro for sempre 4, o constructor ir� inst�nciar a variable com esse valor.
			numeroPassageiros = 4;
		}
		
		Car (String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double conCombustivel_) {
			marca = marca_;
			modelo = modelo_;
			numeroPassageiros = numPassageiros_;
			capacidadeCombustivel = capCombustivel_;
			consumoCombustivel = conCombustivel_;
		}
		
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
