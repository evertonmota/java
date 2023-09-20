package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntefaceFuncionalFunction {

	public static void main(String[] args) {


		/*
		 * 	public interface Function<T, R0>{		 
		  		R apply(T t)
		  	}
		 */
		// É uma função que aplicando um tipo T retorna um R;
		// Útil para criar um objeto (R) a partir de uma lista do tipo T;
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Marcos", 30));
		pessoas.add(new Pessoa("André", 28));
		pessoas.add(new Pessoa("Gustavo", 21));
		pessoas.add(new Pessoa("Ricardo", 15));

		//Gera uma lista de String com nome de pessoas Caixa Alta para maiores de 20 anos e em caixa baixa para menores de 21
		
		Function<Pessoa, String> function = p ->{
			if(p.getIdade() < 21 ) {
				return p.getNome().toLowerCase();
			}else {
				return p.getNome().toUpperCase();
			}
		};
		
		// map é um método que aplica uma função a todos os elementos de uma stream.
		// stream é uma sequencia de dados.
		
		// converte 		lista -> stream					-> list
		List<String> nomes = pessoas.stream().map(function).collect(Collectors.toList());
		
		List<String> names = pessoas.stream()
					.map( n -> n.getIdade() < 21 ? n.getNome().toLowerCase() : n.getNome().toUpperCase())
					.collect(Collectors.toList());
		names.forEach(System.out::println);
		
	}

}
