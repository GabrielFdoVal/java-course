package oo.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caneta", 1.20);
		Produto p2 = new Produto("Lapis", 2.20);
		Produto p3 = new Produto("Borracha", 3.20);
		Produto p4 = new Produto("Apontador", 4.20);
		
		Cliente cliente = new Cliente("Gabriel");
		
		Compra c1 = cliente.novaCompra();
		c1.adicionarItem(new Item(p1, 2));		
		c1.adicionarItem(new Item(p2, 2));
		
		Compra c2 = cliente.novaCompra();
		c2.adicionarItem(new Item(p3, 2));		
		c2.adicionarItem(new Item(p4, 2));
		
		System.out.println("O valor total das compras do "+cliente.nome+" e de "+cliente.obterValorTotal());
	}
}
