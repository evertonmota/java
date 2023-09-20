package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.List;

public class InterfaceFuncionalPredicate {

	public static void main(String[] args) {

		// A interface funcional Predicate
		// Possui um metodo que nos permite implementar, que ele retorne um booleano e como parametro um tipo < T >
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Marcos", 30));
		pessoas.add(new Pessoa("André", 28));
		pessoas.add(new Pessoa("Gustavo", 21));
		pessoas.add(new Pessoa("Ricardo", 15));
		
		int idade = 30;
		pessoas.removeIf( p -> p.getIdade() < idade) ;
		
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}

		// Method Reference ( referencia de Metodo)
		
		pessoas.removeIf( Pessoa::pessoaMenor30Estatico);
		pessoas.removeIf(Pessoa:: pessoaMenor30NaoEstatico);
		
		pessoas.forEach(System.out::println);
		
	}
}
