package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InterfaceFuncionalConsumer {

	public static void main(String[] args) {

	/*
		public interface Consumer<T>{
			void accept(T t);
		}
		Útil para executar algum procedimento.
	*/
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Marcos", 30));
		pessoas.add(new Pessoa("André", 28));
		pessoas.add(new Pessoa("Gustavo", 21));
		pessoas.add(new Pessoa("Ricardo", 15));
		
		Consumer<Pessoa> consumer = p ->{
			if(p.getIdade() < 21){
				p.setNome(p.getNome().toLowerCase());
			}else {
				p.setNome(p.getNome().toUpperCase());
			}
		};
		
		pessoas.forEach(consumer);
		
		//pessoas.forEach( p -> p.setNome(p.getNome().toUpperCase()));
		
		pessoas.forEach(System.out::println);
	}

}
