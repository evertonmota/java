package com.minhaempresa.exercicios.app;

import java.util.ArrayList;
import java.util.List;

import com.minhaempresa.exercicios.Conta;
import com.minhaempresa.exercicios.ContaCorrenteConta;
import com.minhaempresa.exercicios.ContaPoupanca;
import com.minhaempresa.exercicios.enums.TipoValor;

public class App {

	public static void main(String[] args) {

		//Lançar depósito na conta corrente 123456-0 no valor de 100,00
		//Lançar um saque na conta corrente 123456-0 no valor de 70,00;
		ContaCorrenteConta contaCorrente = new ContaCorrenteConta("123456-0");
		contaCorrente.depositar(100.00);
		contaCorrente.sacar(70.00);

		
		//Lançar um deposito na conta corrente 923456-0 no valor de 1000,00;
		ContaCorrenteConta contaCorrente2 = new ContaCorrenteConta("923456-0");
		contaCorrente2.depositar(1000.00);

		//Lançar um deposito na conta poupança 11789-0 no valor de 5000,00;
		ContaPoupanca poupanca = new ContaPoupanca("11789-0");
		poupanca.depositar(5000.00);
		
		//Lançar um deposito na conta poupança 18789-0 no valor de 500,00;
		ContaPoupanca poupanca2 = new ContaPoupanca("18789-0");
		poupanca.depositar(500.00);


		List<ContaCorrenteConta> contasCorrentes = new ArrayList<>();
		
		contasCorrentes.add(contaCorrente);
		contasCorrentes.add(contaCorrente2);
		
		List<ContaPoupanca> contasPoupanca = new ArrayList<>();
		contasPoupanca.add(poupanca);
		contasPoupanca.add(poupanca2);
		
		
		for(ContaCorrenteConta conta : contasCorrentes) {
            conta.imprimirSaldo();
        }
 
        for(ContaPoupanca conta : contasPoupanca) {
            conta.imprimirSaldo();
        }
		
        System.out.println("------------------------USO DE instanceof-------------------");
        System.out.println();
        
        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente);
        contas.add(contaCorrente2);
        contas.add(poupanca);
        contas.add(poupanca2);
        
        
        for(Conta conta : contas) {
        	if( conta instanceof ContaCorrenteConta) {
        		((ContaCorrenteConta) conta).imprimirSaldo();
        	}
        }
        
        
        for(Conta conta: contas) {
        	if(conta instanceof ContaPoupanca) {
        		((ContaPoupanca) conta).imprimirSaldo();
        	}
        }
        
        App app = new App();
        app.meuMetodoComEnum(TipoValor.CONTA_CORRENTE);
        
        app.meuMetodoSemEnum(5); // Enum garante maior segurança quanto ao valor que esta sendo inserido como parametro.
      
	}
	private void meuMetodoSemEnum(Integer tipoValor) {
	 	System.out.println(tipoValor);
	}
	  
	private void meuMetodoComEnum(TipoValor tipoValor) {
	 	System.out.println("O tipo selecionado foi "+tipoValor+ " e que vale " +tipoValor.getValor());
	}

}
