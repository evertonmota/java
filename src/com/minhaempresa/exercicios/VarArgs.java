package com.minhaempresa.exercicios;

public class VarArgs {

	public static void main(String[] args) {

		/* 
		 *  VarArgs foi adicionado no  Java 5 e permite argumentos de compimento variavel para declarar metodos.
		 *  Pode haver apenas um parametro 
		 * o Paramentro de argumentos variavel deve ser o ultimo na assinatura do metodo.
		 * */
		
		VarArgs.imprimetParametros();
		VarArgs.imprimetParametros("a","b");
		VarArgs.imprimetParametros("a","b","c");
		VarArgs.imprimetParametros();
	}

	private static void imprimetParametros( String... parametros) {
		for(int i=0; i < parametros.length; i++) {
			System.out.println(parametros[i]);
		}
		if(parametros.length == 0) {
			System.out.println("Nenhum parametro encontrado.");
		}
		
	}

}
