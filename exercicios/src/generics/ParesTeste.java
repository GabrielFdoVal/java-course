package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria1");
		resultadoConcurso.adicionar(2, "Maria2");
		resultadoConcurso.adicionar(3, "Maria3");
		resultadoConcurso.adicionar(4, "Maria4");
		resultadoConcurso.adicionar(2, "Maria5");
		resultadoConcurso.adicionar(5, "Maria6");
		
		System.out.println(resultadoConcurso.getValor(2));
	}
}
