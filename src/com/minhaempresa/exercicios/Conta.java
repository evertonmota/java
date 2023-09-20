package com.minhaempresa.exercicios;

import com.minhaempresa.exercicios.enums.Tipo;

public abstract class Conta {

	private String identificadorConta;

	private double saldo;
	
	protected Tipo tipo;
	
	public String mensagem;
	
	public String getIdentificadorConta() {
		return identificadorConta;
	}

	public void setIdentificadorConta(String identificadorConta) {
		this.identificadorConta = identificadorConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void depositar(double valor) {
		this.saldo += valor; 
	}
	
	public void sacar(double valor) {
		
		if(valor > saldo) {
			mensagem = "O valor do Saldo não pode ser NEGATIVO!\n Digite outro valor.";
			System.out.println(mensagem);
			return;
		}
		
		this.saldo -= valor;
	}
	
	@Override
	public String toString() {
		return "Conta [identificadorConta = " + identificadorConta + ", saldo = " + saldo + ", tipo = " + tipo + "]";
	}
}
