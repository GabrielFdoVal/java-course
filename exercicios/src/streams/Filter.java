package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.2);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Luca", 9.2);
		Aluno a4 = new Aluno("Chico", 6.2);
		Aluno a5 = new Aluno("Paula", 7.2);
		Aluno a6 = new Aluno("Antonio", 4.2);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		
		alunos.stream()
			.filter(a -> a.nota >= 7)
			.map(a -> "Parabens "+a.nome+" voce foi aprovado")
			.forEach(System.out::println);
	}
}
