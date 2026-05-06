package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {

		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo",
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");

		List<String> estadosEmMaiusculo = estados.stream()
				.map(x -> x.toUpperCase())
				.collect(Collectors.toList());
		
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList());
		
		long quantidadeDeEstados = estados.stream()
				.distinct()
				.count();
			
		System.out.println("Estados em Maiúsculo: " + estadosEmMaiusculo);
		System.out.println("Estados únicos: " + estadosUnicos);
		System.out.println("Quantidade de Estados únicos: " + quantidadeDeEstados);	
		
		System.out.println("Coleção/Dados Inicial: " + estados);

	}

}
