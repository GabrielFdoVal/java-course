package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Lia", "Bia", "Gui");
		
		aprovados.forEach((aluno) -> {
			System.out.println("Nome: "+aluno);
		});
		
		aprovados.forEach((aluno) -> System.out.println("Nome 2: "+aluno));
		
		aprovados.forEach(System.out::println);
		
		aprovados.forEach((aluno) -> meuImprimir(aluno));
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome e "+nome);
	}
}
