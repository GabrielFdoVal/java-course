package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana1", 7.1);
		Aluno aluno2 = new Aluno("Ana2", 6.1);
		Aluno aluno3 = new Aluno("Ana3", 8.1);
		Aluno aluno4 = new Aluno("Ana4", 10);
		
		List<Aluno> alunos = Arrays.asList(aluno1,aluno2,aluno3,aluno4);
		
		alunos.forEach(System.out::println);
	}
}
