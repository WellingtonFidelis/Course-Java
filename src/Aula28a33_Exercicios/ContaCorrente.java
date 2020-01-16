package Aula28a33_Exercicios;

public class ContaCorrente {

	private String numeroConta;
	private String agencia;
	private double saldo;
	private boolean especial;
	private double limite;
	
	// generate the constructor
	public ContaCorrente() {}
	
	public ContaCorrente(String numeroConta, String agencia, double saldo, boolean especial, double limite) {
		super();
		this.numeroConta = numeroConta;
		this.agencia = agencia;
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
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	
	// building the methods	
	public boolean saque (double quantiaASacar) {
		if (getSaldo()>= quantiaASacar) {
			setSaldo(getSaldo() - quantiaASacar);
			return true;
		} else { // se não estiver com saldo na conta
			if (isEspecial()) { // verify if there is value in the limite
				@SuppressWarnings("unused")
				double limiteEspecial = limite + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false; // isn't special and haven't value
			}
		}
		
	}
	
	public void depositar (double saldo) {
		setSaldo(getSaldo() + saldo);
	}
	
	public void consultarSaldo () {
		System.out.println("Saldo atual = " + getSaldo());
	}
	
	public boolean verificarUsoChequeEspecial () {
		return getSaldo() < 0;
	}
}
