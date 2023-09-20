package com.minhaempresa.exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ManipulandoArquivos {
	
	public static void main(String[] args) {
		
		// alguns tipos de arquivos .xls .txt .pdf .zip e etc
		
		// Leitura e Escrita de Arquivo texto.
		
		List<String> registros = Arrays.asList("Cachorro" , "Gato", "Macaco", "Papagaio");
		
		String caminho = "C:\\Cursos\\arquivos\\";
		
		FileWriter arquivo = null;
		
		BufferedWriter escritor = null;
		
		//grava um arquivo
		try {
			//cria e recria o arquivo
			arquivo = new FileWriter(caminho+"arquivo.txt");
			//arquivo =new FileWriter(camiho+"arquivo.txt",true); // o parametro true acrescenta os dados a um arquivo existente.
			escritor = new BufferedWriter(arquivo);
			
			for(String registro : registros) {
				escritor.write(registro);
				escritor.newLine();
			}
			
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		finally {
			try {
				if(escritor !=null) {
					escritor.close();
				}
				if(arquivo != null) {
					arquivo.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Grava um arquivo utilizando o bloco try-with-resources
		
		// Este bloco declara um ou mais recursos e garante que esses recursos serao fechados ao terminar o bloco.
		
		// Disponível a partir do java 7
		

		try (
			FileWriter arquivo2 = new FileWriter(caminho+"arquivo2.txt");
			BufferedWriter escritor2  = new BufferedWriter(arquivo2);
		){
			for(String reg : registros) {
				escritor2.write(reg);
				escritor2.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error : " +e.getMessage());
		}
	
	
		//Ler o arquivo Texto.
		try (
			FileReader arquivo3 = new FileReader(caminho +"arquivo.txt");
			BufferedReader leitor = new BufferedReader(arquivo3);
		){
			String linha = leitor.readLine();
			while(linha != null) {
				System.out.println(linha);
				linha = leitor.readLine();
			}
		}
		catch (Exception e) {
			System.out.println("Error : " +e.getMessage());
		}
	
		//Manipulando Pastas com File
		File caminhoRecurso = new File(caminho);
		File [] recursos = caminhoRecurso.listFiles();
		File [] recursosArquivo = caminhoRecurso.listFiles(File::isFile);
		File [] recursosPasta = caminhoRecurso.listFiles(File::isDirectory);
		
		
		for(File recurso : recursos) {
			if(recurso.isFile()) {
				System.out.println("ARQUIVO : "+recurso);
				System.out.println("Esta localizado no Caminho : " +recurso.getPath());
				System.out.println("Tamanho do Aquivo em bytes :" +recurso.length());
				System.out.println("Nome do  Arquivo : " + recurso.getName());
			}else {
				System.out.println("Pasta : " +recurso);
			} 
		}
		
		for(File recurso : recursosArquivo) {
			System.out.println("Só Arquivos : " + recurso);
		}
		
		for(File recurso : recursosPasta) {
			System.out.println("Só Pasta : " + recurso);
		}
		
		boolean retorno ;

		File novaPasta = new File(caminho +"umaPastaX");
		
		if(!novaPasta.exists()) {
			retorno = new File(caminho +"umaPastaX").mkdir();
			System.out.println("Pasta Criada  "+retorno);
		}else {
			retorno = new File(caminho + " umPastaX").delete(); // cuidado com este método para nao apagar arquivos indevidamente.
			System.out.println("Pasta deletada " +retorno);
		}
		
		
		
		
	}
}
