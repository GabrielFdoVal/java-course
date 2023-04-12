package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		produtos.forEach(p -> {
			System.out.println(p.getId());
			System.out.println(p.getNome());
			System.out.println(p.getPreco());
		});
	}
}
