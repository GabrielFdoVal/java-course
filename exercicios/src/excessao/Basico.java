package excessao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try {
			imprimirNomeAluno(a1);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no nome do aluno");
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
		System.out.println("Fim");
	}
	
	public static void imprimirNomeAluno(Aluno a) {
		System.out.println(a.nome);
	}
}
