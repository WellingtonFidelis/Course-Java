package Aula28;

import Aula27.Carro;
import aula25a27_Exercicio3.Aluno; // essa é a melhor maneira para se importar uma classe.

// se eu colocar um * logo depois do nome do pacote, irei ter acesso a todas as classes desse pacote. Ex: aula25a27_Exercicio3.*;

public class Pacotes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Carro carro;
		// referenciando uma segunda class do mesmo tipo e nome sendo que em outro pacote
		Aula26.Carro carro2;
		
		Aluno aluno;
	}

}
