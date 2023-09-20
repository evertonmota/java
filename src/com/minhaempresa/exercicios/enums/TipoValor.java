package com.minhaempresa.exercicios.enums;

public enum TipoValor {

	CONTA_CORRENTE(1),
	CONTA_POUPANCA(2),
	CONTA_PAGAMENTO(3);
	
	private Integer valor;
	
	private TipoValor(Integer valor) {
		this.valor = valor;
	}
	
	public Integer getValor() {
		return this.valor;
	}
}
