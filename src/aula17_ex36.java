import java.util.Scanner;

public class aula17_ex36 {

	//declaration of variables of globals and statics
	static Scanner teclado = new Scanner(System.in);
	
	static public void main (String[] args) {
		
		//declaration of variables of locals and constants
		int numeroTermos, i=1;
		double total=0;
		
		// input data
		System.out.println("Expressão: H = 1 + 1/2 + 1/3 ... 1/n");
		System.out.println("Digite o número de termos: ");
		numeroTermos = teclado.nextInt();
		
		// processing data
		total= total + i;
		do {
			i++;
			total += (total + (1/i));
		} while (i<=numeroTermos);
		
		// output data
		System.out.println("O número de termos é: " + numeroTermos + ", o valor de H é: " + total);
	}
}
