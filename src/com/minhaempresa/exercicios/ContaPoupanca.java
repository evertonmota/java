package com.minhaempresa.exercicios;

import com.minhaempresa.exercicios.enums.Tipo;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String identificadorConta) {
		super.setIdentificadorConta(identificadorConta);
		super.tipo = Tipo.CONTA_POUPANCA;	
		}
	
	public double rendimentos() { return  getSaldo() * 0.01; }
	
	public void imprimirSaldo() {
		System.out.println("Conta Poupança : " + super.getIdentificadorConta() + ", Saldo : " + super.getSaldo() + " Tipo de Conta : " +super.tipo+
				" Rendimentos : " +this.rendimentos());
	}
}
