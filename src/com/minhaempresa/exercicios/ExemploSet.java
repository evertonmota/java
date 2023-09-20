package com.minhaempresa.exercicios;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		/*
			SET representa um conjunto de elementos.
			
			- Não permite repetições;
			- O acesso, a inserção e a remoção dos elementos são rápidos;
			- O elemento não tem posição;
			- Oferece operações de interseção, união e diferença;
			
				As principais implementações são :
			
			- HashSet  - É o mais rápido porém não ordenado
			- LinkedHashSet - É o intermediário em desempenho dos três e ordenado pelo compareTo do Objeto Comparator
			- TreeSet - É o mais lento dos três porém com os elementos na ordem  em que são adicionados.
		*/

			Set<String> conjuntoNomesMasculino = new HashSet<>();
			conjuntoNomesMasculino.add("André");
			conjuntoNomesMasculino.add("Helio");
			conjuntoNomesMasculino.add("Gustavo");
			conjuntoNomesMasculino.add("Marcos");
	
			for(String n : conjuntoNomesMasculino) {
				System.out.println(n);
			}
			
			System.out.println(conjuntoNomesMasculino.contains("André"));
			System.out.println(conjuntoNomesMasculino.remove("André"));
		
			Set<String> conjuntoNomesFeminino = new HashSet<>();
			conjuntoNomesFeminino.add("Monica");
			conjuntoNomesFeminino.add("Julia");
			conjuntoNomesFeminino.add("KAte");
			conjuntoNomesFeminino.add("Lua");
			
			Set<String> conjuntoTodosNomes = new HashSet<>();
			conjuntoTodosNomes.addAll(conjuntoNomesMasculino); // Adiciona no conjunto os elementos  do outro  conjuntos (UNIÃO).
			conjuntoTodosNomes.addAll(conjuntoNomesFeminino);
			
			for(String nomes : conjuntoTodosNomes) {
				System.out.println(nomes);
			}
			
			conjuntoTodosNomes.retainAll(conjuntoNomesMasculino); // Mantém apenas os elementos que contem nos dois conjuntos. ( Inteseção )
			
			for(String name : conjuntoTodosNomes) {
				System.out.println(name);
			}
			
			System.out.println("--------------------------------------------");
			
			
			conjuntoTodosNomes.addAll(conjuntoNomesFeminino);
			conjuntoTodosNomes.retainAll(conjuntoNomesMasculino); // Mantém apenas os elementos que contem nos dois conjuntos. ( Inteseção )
			
			for(String name : conjuntoTodosNomes) {
				System.out.println(name);
			}
			
			System.out.println("--------------------------------------------");
			
			System.out.println("A coleção tem a quantidade de: " + conjuntoTodosNomes.size());
			
			conjuntoTodosNomes.clear();
			System.out.println("A coleção tem : " +conjuntoTodosNomes.size());
	}
}
