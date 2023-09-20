package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class InversaoControle {
	/* 
		POO -> S.O.L.I.D Dependence Inversion Principle 
		Dependência de Abstração e não de implementação
	 */
	public static void main(String[] args) {
		
		InversaoControle.semInversaoControle();
		
		InversaoControle.comInversaoControle(new ArrayList<>()); // Injeção de Dependência.
		
		InversaoControle.comInversaoControle(new LinkedList<>()); // Injeção de Dependência.
	}
	
	private static void semInversaoControle() {
		ArrayList umaLista = new ArrayList<>(); // Acoplamento FORTE pois estou dependendo da IMPLEMENTAÇÃO.
		//umaLista.add();
		// Mais codigos...
	}

	public static void comInversaoControle(List list) {
		List lista = list; // Acoplamento FRACO pois eu estou dependendo da ABSTRAÇÃO.
	}
	
	
}
