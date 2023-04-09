package excessao.personalizadaB;

import excessao.Aluno;

public class Validar {

	private Validar() {}
	
	public static void aluno(Aluno aluno) throws NumeroForaIntervaloException, StringVaziaExecption {
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno esta nulo");
		}
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaExecption("nome");
		}
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}
