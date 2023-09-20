package com.minhaempresa.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStream {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Marcos", 30));
		pessoas.add(new Pessoa("André", 28));
		pessoas.add(new Pessoa("Gustavo", 21));
		pessoas.add(new Pessoa("Ricardo", 15));

		Stream<Pessoa> stream = pessoas.stream();
		
		//Operação terminal toArray
		
		System.out.println(Arrays.toString(stream.toArray()));
		
		//Como consumimos acima a stream, não é possível consumir novamente.
		
		//System.out.println(Arrays.toString(stream.toArray()));
		//Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

		//Operação intermediária map
		
		stream = pessoas.stream().map(p -> {
			p.setNome(p.getNome().toUpperCase());
			return p;
		});
		
		
		System.out.println(Arrays.toString(stream.toArray()));
		
		Stream<Integer> stream2 = Stream.of(5,3,7,2,8,4,9,1,0);
		System.out.println(Arrays.toString(stream2.toArray()));
		
		
		//Operacao terminal limit
		Stream<Integer> stream3 = Stream.iterate(0, x -> x + 5);
		System.out.println(Arrays.toString(stream3.limit(3).toArray()));
		
		
		//Operacao terminal findFirst
		Stream<Integer> stream4 = Stream.iterate(5, x -> x + 5);
		Optional<Integer> primeiroElemento = stream4.findFirst();
		System.out.println("Primeiro Elemento : " + primeiroElemento.get());
		
		//Operacao terminal Reduce
		int total = Stream.iterate(0, x -> x +5).limit(3).reduce(0, (a,b) -> a +b);
		System.out.println(total);
		
		
		List<Integer> pipeline = Stream.iterate(0, x -> x +5 ).limit(100).filter( p -> p < 28)
								.map( x -> x * 10).collect(Collectors.toList());
		
		System.out.println(pipeline );
		
		
		
		
	}

}
