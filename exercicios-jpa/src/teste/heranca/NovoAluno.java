package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		DAO<Aluno> alunoDao = new DAO<>();
		Aluno aluno1 = new Aluno(123L, "Gabriel");
		alunoDao.incluirAtomico(aluno1);
		
		AlunoBolsista aluno2 = new AlunoBolsista(321L, "Maria", 1000.0);
		
		alunoDao.incluirAtomico(aluno2);
		
		alunoDao.fechar();
	}
}
