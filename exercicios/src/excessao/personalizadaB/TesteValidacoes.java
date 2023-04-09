package excessao.personalizadaB;

import excessao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Ana", -7);
		
		try {
			Validar.aluno(aluno);
		} catch (StringVaziaExecption e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Validar.aluno(null);
		} catch (StringVaziaExecption | NumeroForaIntervaloException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e ) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");
	}
}
