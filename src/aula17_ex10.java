import java.util.Scanner;

public class aula17_ex10 {

	//declaration of variables globals and statics
	static Scanner teclado = new Scanner(System.in);
	
	static public void main (String[] args) {
		//declaration of variables locals and constants
		int num1, num2, numMenor, numMaior;
		
		//input data
		System.out.println("Program for print numbers between two input numbers");
		System.out.println("---------------------------------------------------");
		System.out.println("input the first number: ");
		num1 = teclado.nextInt();
		System.out.println("input the second number: ");
		num2 = teclado.nextInt();
		
		//processing data
		if (num1 > num2) {
			numMenor = num2;
			numMaior = num1;
		} else {
			numMenor = num1;
			numMaior = num2;
		}
		
		do {
			System.out.println("The numbers between the first and second are: ");
			System.out.println(numMenor);
			numMenor ++;
		} while (numMenor <= numMaior);
		//ué2
	}
}
