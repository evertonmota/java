package com.minhaempresa.exercicios;

import java.util.HashMap;
import java.util.Map;

public class Hash {

	public static void main(String[] args) {

		/*
		 	HashMap - Utilizado quando queremos recuperar determinado dado baseado CHAVE - VALOR.
		 	Não admite repetição do Objeto CHAVE.
		 	O acesso, inserção e remoção dos elementos são rápidos.
		 	
		 	Existem outras implementações de MAP sendo que o HasMap é a mais RÁPIDA das três.
		 	
		 		- LinkedHasMap - Velocidade de acesso intermediaria quando comparado com as três mencionadas.
		 	
		 		- TreeMap - É a mais LENTA. E é ORDENADA pelo CompareTo do Objeto ou Comparator.
		 	
		 */
		
		Map<String, ContaCorrente> map = new HashMap<>();
		
		map.put("001878788-8", new ContaCorrente(300.00));
		map.put("09988h760-5", new ContaCorrente(8500.00));
		map.put("9999i9000-4", new ContaCorrente(7700.00));
		
		ContaCorrente cc = map.get("001878788-8");
		
		System.out.println(cc.saldo());
		
		System.out.println("----------------------------------------------------------");
		
		
		for(ContaCorrente conta : map.values()) {
			System.out.println(conta.saldo());
		}
		
		for(String key : map.keySet()) {
			ContaCorrente conta  = map.get(key);
			System.out.println(conta.saldo());
		}
		
		
		
	}

}
