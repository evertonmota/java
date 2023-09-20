package com.minhaempresa.exercicios;

public interface ExemploInterface {
	
	/*
		 A partir do JAVA 8 temos default methods ou defender methods
		 É um tipo que define um conjunto de operações que uma classe deve implementar,
		 A Interface estabelece um Contrato que a classe deve cumprir.
		 
		 Utilizado para que possamos criar Sistemas de Baixo Acoplamento.
		 
		 POO -> S.O.L.I.D 	D => Dependence Inversion Principle -< Dependência de Abstração e não de implementação.
		 
		 Exemplo : 
		 			ArrayList list = new ArrayList(); // forte acoplamento.
		 			
		 			List list = new ArrayList(); // acoplamento fraco.
		 			
		 			Se a classe ArrayList for substituida por outra que implemente List, nada mudará no meu sistema.
	 */

	void meuMetodo();
}
