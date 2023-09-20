package com.minhaempresa.exercicios;

import com.minhaempresa.exercicios.enums.Tipo;

public class ContaCorrenteConta extends Conta{
	
	public ContaCorrenteConta() {
	}

	public ContaCorrenteConta(String identificadorConta) {
		super.setIdentificadorConta(identificadorConta);
		super.tipo= Tipo.CONTA_CORRENTE;
	}
	
	public void imprimirSaldo () {
		System.out.println("Conta Corrente : " + super.getIdentificadorConta() + ", Saldo : " + super.getSaldo() + " Tipo de Conta : " + super.tipo);
	}

}
