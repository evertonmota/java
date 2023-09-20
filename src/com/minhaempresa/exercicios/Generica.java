package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Generica<T>{

	public static void main(String[] args) {
		
	/*
 			Generics Permite que classe , interface e metodos possam ser parametrizados por tipo.
 			<Tipo>
 			Vantagens : 
 						-Type Safety
 						-Perfomance
 						-Reuso
	 */
		
		//Uso com Generics
		List<String > list = new ArrayList<>();
		list.add("Everton Mota");
		list.add("Joana");
		list.add("Sophia");
		list.add("Maria");
		
		String nome = list.get(0);
		
		
		// Uso sem Generics
		List list2 = new ArrayList<>();
		list2.add("Marcos");
		list2.add("Joao");
		list2.add(new Pessoa("Marcos", 33));
		
		String name = (String) list2.get(0); 
		
		Generica<String> g =  new Generica<>();
		g.imprime("Matheus da Silva Xavier");
		
		
		Generica<Integer> h =  new Generica<>();
		h.imprime(1);
		
		System.out.println(h.max(list));
	}

	// Exemplo de Generics Delimitado.
	// Método para retornar o maximo de elementos
	
	private <T extends Comparable<? super T >> T max(List<T> list) {

		if(list.isEmpty()) {
			return null;
		}
		
		T max = list.get(0);
		for(T item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
				break;
			}
		}
		return max;
	}

	private void imprime(T parametro) {
		System.out.println(parametro);
		
	}
}
