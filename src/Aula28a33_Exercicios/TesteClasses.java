package Aula28a33_Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import Aula28a33_Exercicios.Aluno;
//http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33

public class TesteClasses {

	static Scanner tecla = new Scanner (System.in);
	
	static ArrayList<ContaCorrente> lista1 = new ArrayList<>();
	static ArrayList<Aluno> lista2 = new ArrayList<Aluno>();

	public static void main(String[] args) {

		int op; // to navigate between the menu
		do {

			System.out.println("-----MENU PRINCIPAL-----");
			System.out.println("0 - Para desligar a lampada.");
			System.out.println("1 - Para ligar a lampada.");
			System.out.println("2 - Para cadastrar uma Conta Corrente.");
			System.out.println("3 - Para sacar um valor.");
			System.out.println("4 - Para depositar um valor.");
			System.out.println("5 - Para cadastrar um aluno.");
			op = tecla.nextInt();

			switch (op) {
			case 0: TesteLampada(op); break;
			case 1: TesteLampada(op); break;
			case 2: criarContaCorrente(); break;
			case 3: sacarValor(); break;
			case 4: depositarValor(); break;
			case 5: cadastrarAluno(); break;
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
		System.out.println("Digite o numero da agencia:");
		String agencia = tecla.next(); // salve the number of agency
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
		
		lista1.add(new ContaCorrente (numeroConta, agencia, saldoInicial, especial, limite));
		System.out.println("Conta Corrente cadastrada com sucesso!");
	}
	
	private static void sacarValor() {
		System.out.println("Digite o numero da conta:");
		String numeroConta = tecla.next(); // salve the number of account
		System.out.println("Digite o valor a sacar:");
		double valorSacar = tecla.nextDouble(); // salve the valueOut value of account
		
		for (ContaCorrente conta : lista1) { // create a variable of type Conta Corrente to find the account
			if (conta.getNumeroConta().equals(numeroConta)) {
				conta.saque(valorSacar); // call the method saque of ContaCorrente
				break;
			} else {
				System.out.println("Numero de conta não encontrada."); break;
			}
		}
	}
	
	private static void depositarValor() {
		System.out.println("Digite o numero da conta:");
		String numeroConta = tecla.next(); // salve the number of account
		System.out.println("Digite o valor a depositar:");
		double valorDepositar = tecla.nextDouble(); // salve the valueIn value of account
		
		for (ContaCorrente conta : lista1) { // create a variable of type Conta Corrente to find the account
			if (conta.getNumeroConta().equals(numeroConta)) {
				conta.depositar(valorDepositar); // call the method depositar of ContaCorrente
				break;
			} else {
				System.out.println("Numero de conta não encontrada."); break;
			}
		}
	}
	
	private static void cadastrarAluno() {
		
		String[] disciplina = new String [3];
		double[][] notas = new double [3][2];
		
		System.out.println("digite o nome do Aluno:");
		String nome = tecla.next();
		System.out.println("Digite o numero da matricula:");
		String matricula = tecla.next();
		System.out.println("Digite o nome do curso:");
		String curso = tecla.next();
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome da " + (i+1) + " disciplina:");
			disciplina[i] = tecla.next();
		}
		System.out.println(" ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Notas da disciplina de " + disciplina[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Digite a " + (j+1) + " nota de " + disciplina[i]);
				notas[i][j] = tecla.nextDouble();
			}
			System.out.println(" ");
		}
		
		lista2.add(new Aluno (nome, matricula, curso, disciplina, notas));
	}
}
