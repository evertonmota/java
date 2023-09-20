package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.List;

public class LambdaComparator {

	public static void main(String[] args) {
		
		/*
		 * Expressões Lambda (Função Anônima)
		 * 
		 * Disponivel a partir do java 8
		 * 
		 * S.O.L.I.D -> O - > Aberta para extensão, mas fechada para modificação.
		 */

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Marcos", 30));
		pessoas.add(new Pessoa("André", 28));
		pessoas.add(new Pessoa("Gustavo", 21));
		pessoas.add(new Pessoa("Ricardo", 15));
		
		//Collections.sort(pessoas);
		/*
		Comparator<Pessoa> comparator = (x, y) ->{
			return x.getIdade().compareTo(y.getIdade()); 
		};
		*/
		pessoas.sort( (x,y) -> x.getIdade().compareTo(y.getIdade()));
		
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
	}
}
