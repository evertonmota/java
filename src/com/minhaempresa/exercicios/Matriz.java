package com.minhaempresa.exercicios;

public class Matriz {

	public static void main(String[] args) {
		
		int linha = 3;
		int coluna = 2;
		
		String [][] minhaMatriz = new String [linha][coluna];
		
		minhaMatriz[0][0] = "João";
		minhaMatriz[0][1] = "62 anos";
		minhaMatriz[1][0] = "Maria";
		minhaMatriz[1][1] = "63 anos";
		minhaMatriz[2][0] = "Everton";
		minhaMatriz[2][1] = "44 anos";
		
		for( String[] resultado : minhaMatriz) {
			System.out.println(resultado[0] + " tem " + resultado[1] +"\n");
			
		}
		
	}

}

