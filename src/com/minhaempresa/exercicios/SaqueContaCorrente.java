package com.minhaempresa.exercicios;

public class SaqueContaCorrente {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente(5000);
		conta.saldo();
		conta.depositar(1000);
		conta.depositar(250);
		conta.sacar(1000);
		conta.sacar(500);
		
		conta.saldo();
	}

}
