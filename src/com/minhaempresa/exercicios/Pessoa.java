package com.minhaempresa.exercicios;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Pessoa implements Comparable<Pessoa>{

	private String nome;
	private Integer idade;
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	@Override
	public int compareTo(Pessoa obj) {
		return this.getNome().compareTo(obj.getNome());
		//return this.getIdade().compareTo(obj.getIdade());
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
	
	
	public static boolean pessoaMenor30Estatico(Pessoa p) {
		return p.getIdade() < 30;
	}
	public boolean pessoaMenor30NaoEstatico() {
		return  this.getIdade() < 30;
		
	}
	
	public static void umMetodo( List<Pessoa> t, Predicate<Pessoa> predicate) {
		
		for(Pessoa p: t) {
			System.out.println("Faz algo com a pessoa : " + p.getNome());
		}
	}
	
}
