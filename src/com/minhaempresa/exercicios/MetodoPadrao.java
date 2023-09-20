package com.minhaempresa.exercicios;

public interface MetodoPadrao {

	/* 
	 	Default methods ou defender existe a partir do java 8
	 	
	 	Em resumo é a possibilidade de ter métodos implementados na interface
	 	
	 	para evitar repetições de codigos em metodos que são comuns.
	 	
	 	 Obs :. INTERFACES nao contem constutores e nem atributos.
	 */
	
	double umMetodo();
	
	default double outroMetodo() {
		//..... logica 
		return 0.0;
	}
}
