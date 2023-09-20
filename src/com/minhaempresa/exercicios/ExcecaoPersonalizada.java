package com.minhaempresa.exercicios;

public class ExcecaoPersonalizada extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {

		
		
	}

	public ExcecaoPersonalizada(String message) {
		super(message);
		System.out.println("Exceção personalizada executada!");
	}
}
