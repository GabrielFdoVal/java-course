package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.Item;
import modelo.umpramuitos.Pedido;

public class ObterPedido {

	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		Pedido pedido = dao.obterPorId(1L);
		
		dao.fechar();
		for(Item item : pedido.getItens()) {
			System.out.println(item.getQtde());
		}
		
	}
}
