package com.minhaempresa.exercicios;

public class ContaCorrente {

	public double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		this.saldo();
	}

	public void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Seu saldo é insuficiente! Saldo Atual -> " + this.saldo);
			return;
		}
		saldo -= valor;
		this.saldo();
	}
	
	public double saldo() {
		System.out.println("O seu saldo é " + this.saldo);
		return this.saldo;
	}
	
}
