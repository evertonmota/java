package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.List;

public class Composicao {

	/* 
	 	É um tipo  de associação que permite que outro objeto contenha outro objeto.
	 	E porque faz isso ?
	 	
	 	Para obter :
	 		Organização : divisão de responsabilidade;
	 		 Coesão : Cada objeto é responsável por uma única coisa evitando que uma classe "faça mais do que deva" ou seja
	 		 cada classe tem determinada responsabilidade.
	 		 
	 		 POO : -> Principio  de Responsabilidade Única (s) do (S.O.L.I.D )
	 		 
	 		 Reuso : O Mesmo Objeto pode ser reaproveitado em mais de um lugar.
	  
	  		Exemplo :  Classe de Envio de mensagem SMS poderia ser  reutilizada  em diversos pontos  do projeto e até outros projetos. 
	 * */
	
	public static void main(String[] args) {

		// Exemplo de composição
		ContaCorrenteConta contaCorrente = new ContaCorrenteConta("123456-5");
		contaCorrente.imprimirSaldo();
		
		// Exemplo de uma composição
		List<Conta> banco = new ArrayList<>();
		banco.add(contaCorrente);
	}
}
