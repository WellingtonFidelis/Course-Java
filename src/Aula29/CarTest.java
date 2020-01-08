package Aula29;

public class CarTest {

	public static void main(String[] args) {

		Car van = new Car();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		// van.numeroPassageiros = 10;
		van.capacidadeCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.numeroPassageiros);
		
		Car van2 = new Car("Fiat", "Ducato", 10, 100, 0.2);		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numeroPassageiros);
		System.out.println(van2.capacidadeCombustivel);
		System.out.println(van2.consumoCombustivel);
		
	}

}
