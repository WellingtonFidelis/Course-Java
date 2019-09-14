import java.util.Scanner;

public class BreakAndContinuos {
	
	// declaration of variables globals and statics
	static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		// declaration of variables locals and constants
		int num, max;
		
		// input data
		System.out.println("Entre com um número: ");
		num = scan.nextInt();
		System.out.println("Entre com um limite: ");
		max = scan.nextInt();

		for (int i = num; i <= max; i++) {
			System.out.println(i);
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break;
			}
		}
		
		*/
		
		/*// uso dos rotulos
		 for (int i = 0; i <= 4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1) {
							break rotulo1;
						}
						if (i == 2) {
							break rotulo2;
						}
						if (i == 3) {
							break rotulo3;
						}
						System.out.println("rotulo3");
						}
					System.out.println("rotulo2");
					}
				System.out.println("rotulo1");
				}
		System.out.println(i);
		}
		*/
		
		// uso do continue
		// declaration of variables locals and constants
				int num, max;
				
				// input data
				System.out.println("Entre com um número: ");
				num = scan.nextInt();
				System.out.println("Entre com um limite: ");
				max = scan.nextInt();

				for (int i = num; i <= max; i++) {
					if (i % 7 == 0) {
						continue;
					}
					System.out.println("O valor de i é: " + i);
				}
		
		
		
	}

}
