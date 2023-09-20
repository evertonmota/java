package com.minhaempresa.exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicios003 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor : ");
		double valor = teclado.nextDouble();
		
		boolean par = (valor % 2) == 0;
		
		if(par) {
			for(int i=0; i < 4; i++) {
				
				System.out.println("O valor PAR ");
			}
		}else {
			for(int i=0; i< 3; i++)
			System.out.println("Valor ÍMPAR ");
		}
		
		System.out.println();
		
		System.out.println("Digite uma nova Frase!");
		teclado.nextLine();
		
		String frase = teclado.nextLine();
		StringBuilder sb = new StringBuilder(frase);
		System.out.println(sb.reverse().toString().toUpperCase());
		
		teclado.close();
		
		// Escreva data atual Ex: 10/09/2023 10:20:50
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		String dataFormatada = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		System.out.println("");
		
		System.out.println(dataFormatada);
	}

}
