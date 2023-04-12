package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		Filme filme1 = new Filme("Hobbit", 8.1);
		Filme filme2 = new Filme("Hobbit2", 8.1);
		
		Ator ator1 = new Ator("Juliete");
		Ator ator2 = new Ator("Leonardo di caprio");
		
		filme1.adicionarAtor(ator1);
		filme1.adicionarAtor(ator2);
		
		filme2.adicionarAtor(ator1);
		
		DAO<Filme> dao = new DAO<>();
		
		dao.incluirAtomico(filme1);
	}
}
