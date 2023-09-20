package com.minhaempresa.exercicios;

public class ReferenciaOuValor {

	public static void main(String[] args) {
		int valor = 1;
		
		primitiveMethod(valor);
		System.out.println(valor);
		
		System.out.println("------------------------------------------------------------");
		
		Pessoa p = new Pessoa();
		meuMetodoObjeto(p);

		System.out.println(p.toString());
	}

	private static void meuMetodoObjeto(Pessoa p) {

		p.setIdade(80);
		p.setNome("José");
		
		p = new Pessoa("Jorge Matheus", 60);
	}

	// Em java os parametros sempre são passados por valor
	//passagem de parametro por valor
	private static final void primitiveMethod(int value) {
		value = 51;
	}

}
