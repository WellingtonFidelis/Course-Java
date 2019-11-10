package aula25a27_Exercicio2;

public class Conta {
	private long numeroConta;
	private double saldo;
	
	//constructor
	public Conta(long numeroConta,double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar (double valor) {
		setSaldo(getSaldo() - valor);
		// saldo -= valor;
	}
	
	public void depositar (double valor) {
		setSaldo(getSaldo() + valor);
		// saldo += valor;
	}
	
}
