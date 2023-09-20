package com.minhaempresa.exercicios;

public class Excecoes {

	public static void main(String[] args) {

		/*
		
		 	No Java e exceção é um objeto herdado das classes:
		 	
		 	java.lang.RuntimeException - O compilador nao obriga a tratar ou a propagar: Falta de Memória
		 	java.lang.Exception - Neste caso o compilador obriga a tratar ou propagar  a exceção : NullPointerException
		 
		 	* Tratar o erro e resolvê-lo sem parar o programa.
		 	* Delegar a lógica do erro para a classe que saiba resolver
		*/
		
		ContaCorrenteConta conta = new ContaCorrenteConta("012345678-9");
		conta = null;
		
		//Excecoes.metodoQueNaoTrataUmaExcecao(conta);
		
		Excecoes.metodoQueTrataExcecao(conta);
		
		
		try {
			Excecoes.metodoQueLancaUmaExcecao(conta);
		} catch (Exception e) {
			// TODO: handle exception
			//faz alguma coisa
			try {
				Excecoes.metodoQueLancaUmaExcecao(conta);

			}catch (Exception ex) {
				// TODO: handle exception
			}
		}
	}

	public static void metodoQueNaoTrataUmaExcecao(ContaCorrenteConta c) {
		c.imprimirSaldo();
	}

	public static void metodoQueTrataExcecao(ContaCorrenteConta conta) {
		try {
			conta.imprimirSaldo();
		} catch (NullPointerException e) {
			//Toma alguma decisao
			conta = new ContaCorrenteConta("1010200-5");
			Excecoes.metodoQueTrataExcecao(conta);
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			System.out.println("A rotina processou ate o fim.");
		}
	}

	public static void metodoQueLancaUmaExcecao(ContaCorrenteConta conta) throws Exception{
		conta.imprimirSaldo();
		
	}
	
	public static void metodoQueLancaUmaExcecao2(ContaCorrenteConta conta) throws Exception{
		try {
			conta.imprimirSaldo();
			
		} catch (NullPointerException e) {
			throw new NullPointerException(e.toString());
		}
		throw new ExcecaoPersonalizada("Aconteceu algum erro");
	}
	
}
