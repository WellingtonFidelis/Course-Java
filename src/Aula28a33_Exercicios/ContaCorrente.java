package Aula28a33_Exercicios;

public class ContaCorrente {

	private String numeroConta;
	private double saldo;
	private boolean especial;
	private double limite;
	
	// generate the constructor
	public ContaCorrente(String numeroConta, double saldo, boolean especial, double limite) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.especial = especial;
		this.limite = limite;
	}

	// generate methods getters and setters	
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	// building the methods
	
	public void saque (String numeroConta, double saldo) {
		
	}
	
}
