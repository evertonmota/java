package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.List;

public class FuncaoQueRecebeFuncao {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Marcos", 30));
		pessoas.add(new Pessoa("André", 28));
		pessoas.add(new Pessoa("Gustavo", 21));
		pessoas.add(new Pessoa("Ricardo", 15));

		Pessoa.umMetodo(pessoas, p -> p.getIdade() < 30);
	}

}
