package com.minhaempresa.exercicios;

public abstract class ClasseAbstrata {
	
	/*
		É uma classe que não pode ser instânciada ou seja não dar para usar o operador new CLASSE e criar OBJETO.
		
		Classe abstrata é utlizada para ser o modelo, é uma forma de garantir herança total pois
		
		somente as subclasses não abstratas podem ser instânciadas. É uma classe criada para ser a mais genérica que as filhas podendo
		
		conter métodos que serão utilizadas nas filhas  e por vezes sobrescritos
		
		- Podem conter métodos abstratos ou seja métodos sem implementações
		
		- Promove o Reuso.
		
		- Promove o polimorfismo
	*/
	
	public abstract void meuMetodo(); // Obrigado as classes filhas a implementar  com essa assinatura.
	
}
