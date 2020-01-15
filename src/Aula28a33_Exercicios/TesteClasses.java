package Aula28a33_Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteClasses {

	static Scanner tecla = new Scanner (System.in);
	
	static ArrayList<ContaCorrente> lista1 = new ArrayList<>();

	public static void main(String[] args) {

		int op; // to navigate between the menu
		do {

			System.out.println("-----MENU PRINCIPAL-----");
			System.out.println("0 - Para desligar a lampada.");
			System.out.println("1 - Para ligar a lampada.");
			System.out.println("2 - Para cadastrar uma Conta Corrente.");
			op = tecla.nextInt();

			switch (op) {
			case 0: TesteLampada(op); break;
			case 1: TesteLampada(op); break;
			case 2: criarContaCorrente(); break;
			case 9: break;
			}

		} while (op != 9);
	}

	private static void TesteLampada (int estadoLampada) {

		Lampada fluorescente = new Lampada(); // instancia uma Lampada

		if (estadoLampada == 0) {
			System.out.println("");
			fluorescente.setEstado(true);
			fluorescente.mudarEstado(fluorescente.isEstado());
			System.out.println(""); System.out.println(""); // pula duas linhas
		} else if (estadoLampada == 1) {
			System.out.println("");
			fluorescente.setEstado(false);
			fluorescente.mudarEstado(fluorescente.isEstado());
			System.out.println(""); System.out.println(""); // pula duas linhas
		}
	}
	
	private static void criarContaCorrente () {
		boolean especial;
		System.out.println("Digite o numero da conta:");
		String numeroConta = tecla.next(); // salve the number of account
		System.out.println("Digite o saldo inicial:");
		double saldoInicial = tecla.nextDouble(); // salve the inicial value of account
		System.out.println("Essa conta é especial? (0)-Não ou (1)-Sim");
		int num = tecla.nextInt();
			if (num == 0) {
				especial = false;
			} else {
				especial = true;
			}
		System.out.println("Qual será o limite da conta?");
		double limite = tecla.nextDouble();
		
		lista1.add(new ContaCorrente (numeroConta, saldoInicial, especial, limite));
		System.out.println("Conta Corrente cadastrada com sucesso!");
	}
	
}
