package aula25a27_Exercicio2;
import java.util.ArrayList;
import java.util.Scanner;


public class appBancoMain {
	
	static Scanner scan = new Scanner(System.in);
	static int maxConta = 10;
	static ArrayList<Conta> lista1 = new ArrayList<> ();

	public static void main(String[] args) {
		
		
		
		int option;
		do {
			System.out.println("----Selecione uma opcao:----");
			System.out.println("1 - Criar conta corrente.");
			System.out.println("2 - Sacar.");
			System.out.println("3 - Depositar.");
			option = scan.nextInt();
			
			switch (option) {
				case 1 : criarContaCorrente(); break;
				case 8 : break;
			}
			
		} while (option != 8);
	}
	
	public static void criarContaCorrente() {
		// input the number account
		System.out.println("Digite o número da conta:");
		long numero = scan.nextLong();
		// input the balance of account
		System.out.println("Digite o saldo inicial:");
		double saldo = scan.nextDouble();
		// input the limit
		System.out.println("Qual o limite da conta?");
		double limite = scan.nextDouble();
		// input if the account is special or not
		System.out.println("Está conta é especial? [1]Sim ou [0]Não");
		int t = scan.nextInt();
		ContaCorrente.testeStatus(t);
		// create a new object of type ContaCorrente at lista1
		lista1.add(new ContaCorrente(numero, saldo, limite, t));
		System.out.println("Conta criada com sucesso");
	}

}
