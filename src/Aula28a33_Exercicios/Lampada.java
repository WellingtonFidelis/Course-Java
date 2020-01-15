package Aula28a33_Exercicios;

public class Lampada {
	private boolean estado;
	
	
	// create the constructor
	public Lampada(boolean estado) {
		super();
		this.estado = estado;
	}
	
	public Lampada () {}
	
	// create the method get
	public boolean isEstado() {
		return estado;
	}
	
	// create the method set
	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	// 
	public void mudarEstado(boolean estado) {
		if(estado) {			
			this.setEstado(false);
			System.out.println("A lampada estava ligada e foi desligada!");
			 
		} else {
			this.setEstado(true);
			System.out.println("A lampada estava desligada e foi ligada!");
			}
	}
}
