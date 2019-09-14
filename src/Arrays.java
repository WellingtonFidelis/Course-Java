
public class Arrays {

	public static void main(String[] args) {
		
		// practice good of Java is to declare arrays after type of data
		double[] tempDiaria = new double [365];
		
		tempDiaria[0] = 31.3;
		tempDiaria[0] = 31.4;
		tempDiaria[0] = 31.5;
		
		System.out.println("O valor da temperatura do dia 1 é: " + tempDiaria[0]);
		System.out.println("O tamanho do array: " + tempDiaria.length);
		
		System.out.println("Valores do Array: ");
		
		for (int i=0; i < tempDiaria.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i+1) +" é: " + tempDiaria[i]);
		}

		// Array melhorado para saída apenas do valor.
		for (double temp : tempDiaria) {
			System.out.println(temp);
		}
		
		// lista de exercícios
		// http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
	}

}
