package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListaArray {
	public static void main(String[] args) {
		/* ArrrayLista é diferente de Array [] vc nao precisa alocar quantos elementos ele tem,
		   e pode ser iniciada vazio.*/
		
		ArrayList<Integer > x = new ArrayList<>();
		
		// É uma BOA prática utilizar INTERFACE em vez de classes sempre que possível.
		ArrayList<Integer> y = new ArrayList<>();
		y.add(1000);
		y.add(500);
		y.add(100);
		y.add(200);
		
		for (Integer z : y) {
			System.out.println(z); // imprime na ordem que os elementos foram inseridos na lista.
		}
		System.out.println();
		System.out.println("Lista com novos elementos....");
		y.add(1, 12000);
		
		for(Integer i : y) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Tamanho da lista de Y : " +y.size());
		
		System.out.println("Lista sem elementos no indice [2] ");
		y.remove(2);
		
		for(Integer i : y) {
			System.out.println("Nova lista " +i);
		}
		
		y.remove(Integer.valueOf(1000)); // remove o elemento cujo o valor é 1000.
		
		System.out.println("Lista sem o elemento valor 1000 => ");
		for(Integer i : y) {
			System.out.println(i);
		}
		
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Imprimindo o Índice do valor 12000 " +y.indexOf(Integer.valueOf(12000)));
		System.out.println("Imprimindo o Índice do valor 12000 " +y.indexOf(Integer.valueOf(500)));
		
		
		System.out.println("Lista com Elementos com valores menor que 99 ");
		
		y.removeIf( r -> r < 100); // Usando predicate que retorna true / false (Função Lambda).
		
		for(Integer z : y) {
			System.out.println(z);
		}
		
		y.add(1);
		y.add(2);
		y.add(3);
		y.add(4);
		y.add(5);

		System.out.println("Lista todos Elementos adicionados...");
		for(Integer z : y) {
			System.out.println(z);
		}
		
		System.out.println("-----------------Lista todos os valores menores que 10 =  valor < 10. ------------------------ ");
		List<Integer> novaLista = y.stream().filter(  f -> f < 10 ).collect(Collectors.toList());
		
		for(int n : novaLista) {
			System.out.println(n);
		}
		
		
		System.out.println("------------Retorna o Primeiro Elemento maior que 20000");
		
		Integer valorMaior2000 = y.stream().filter( p -> p > 20000).findFirst().orElse(null);
		System.out.println(valorMaior2000);
		
		System.out.println("------------Retorna valores MAIORES que  10");
		
		Integer maior10 = y.stream().filter( p -> p > 10).findFirst().orElse(null);
		System.out.println(maior10);
	}
}
