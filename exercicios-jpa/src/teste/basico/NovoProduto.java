package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("Caneta", 7.45);
		dao.abrirTransacao().incluir(produto).fecharTransacao();
		
		Produto produto1 = new Produto("Notebook", 1007.45);
		dao.incluirAtomico(produto1).fechar();
	}
}
