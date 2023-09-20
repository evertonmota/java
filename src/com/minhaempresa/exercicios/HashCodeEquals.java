package com.minhaempresa.exercicios;

public class HashCodeEquals {

	public static void main(String[] args) {

		/*
 		   Hashcode & Equals sao operadores da classe Object utilizadas para comparar se um objeto é igual ao outro.
		  
		   Hashcode - É um operação rapida, porem o resultado nao garantido 100% a devido a existir uma chance  de obejtos diferentes
		   do mesmo Hashcode.
		   
		   Equals - É uma operação LENTA (quando comparado com o Hashcode ) porém é 100% garantida.
		   Os tipos comuns ( String , Double , Integer, entre outros...) possuem implementação para esta operação;
		   Já a nossa Classe personalizada precisam sobrepô-las.
		 */
		
		Pessoa p1 = new Pessoa("João", 30);
		Pessoa p2 = new Pessoa("João", 30);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2)); // Se nao tiver o método implementado na Classe Pessoa o retorno sera false.
	}

}
