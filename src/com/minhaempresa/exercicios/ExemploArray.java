package com.minhaempresa.exercicios;

public class ExemploArray {

	public static void main(String[] args) {
	
		String [] pacientes = new String [4];	
		
		pacientes [0] = "Julia";
		pacientes[1] = new String ("Joao");
		pacientes[2] = "Matheus";
	
		String[] maisPacientes = new String[4];
		
		for(int i=0; i < pacientes.length; i++) {
			maisPacientes[i] = pacientes[i];
		}
		
		System.arraycopy(pacientes, 0, maisPacientes, 0, 3);
		
		System.out.println(maisPacientes[2]);
		System.out.println(maisPacientes[3]); // imprime null
		
		maisPacientes[3] = "Julia";
		System.out.println(maisPacientes[3]); // imprime Julia
		
		
		int [] valores = new int[10];
		
		for(int i=0; i< valores.length; i++) {
			valores[i] = i;
		}
		
		
		for(int listaValor : valores) {
			System.out.println(listaValor);
		}
	}
}
