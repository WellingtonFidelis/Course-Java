package aula25a27_Exercicio2;

public class ContaCorrente extends Conta{

	static boolean status;
	private double limite;
	
	// constructor
	public ContaCorrente (long numero, double saldo, double limite, int t) {
		super ( numero, saldo);
		this.limite = limite;
		
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		ContaCorrente.status = status;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public static boolean testeStatus (int t) {
		if (t == 0) {
			status = false;
		}
		
		if (t == 1) {
			status = true;
		}
		
		return status;
	}
	
	@Override
	public void sacar(double valor) {
		if (valor < this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);	
		} else if (valor <= limite) {//verificar a opção
			this.limite -= valor;
		}else {
			System.out.println("Seu saldo é de apenas " + this.getSaldo() + ".");
		}
	}
	
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
}
