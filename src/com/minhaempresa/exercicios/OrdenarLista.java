package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenarLista {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		lista.add("D");
		lista.add("H");
		lista.add("G");
		lista.add("C");
		lista.add("F");
		lista.add("B");
		lista.add("A");
		lista.add("E");
		
		// USAR Método sort da Classe Collections que ordena o array.
		
		Collections.sort(lista);
		
		for( String letras : lista) {
			System.out.println(letras);
		}
		
		System.out.println("------------------------------------------------------------");
		
		Collections.reverse(lista);
		for(String s: lista) {
			System.out.println(s);
		}
		System.out.println();
		
		System.out.println("------------------------------------------------------------");

		List<Integer> numeros = new ArrayList<>();
		numeros.add(4);
		numeros.add(0);
		numeros.add(3);
		numeros.add(1);
		numeros.add(5);
		numeros.add(2);
		
		Collections.sort(numeros);
		for(int n : numeros) {
			System.out.println(n);
		}
	
		System.out.println("------------------------------------------------------------");
		Collections.reverse(numeros);
		for(int x : numeros) {
			System.out.println(x);
		}
		
		System.out.println("----------------Ordenando Objetos------------------");
		
		Pessoa p1 = new Pessoa("Rodrigo",30);
		Pessoa p2 = new Pessoa("Vinicius",15);
		Pessoa p3 = new Pessoa("Paulo",45);
		Pessoa p4 = new Pessoa("Marcos",7);
		Pessoa p5 = new Pessoa("Garry",48);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		
		// Collections.sort(pessoas); Não Funciona pq a Classe precisa implements a Comparable
		Collections.sort(pessoas);
		
		for(Pessoa p : pessoas) {
			System.out.println(p.getNome() +" , " + p.getIdade());
		}
		
	}

}
