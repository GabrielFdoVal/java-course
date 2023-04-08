package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Item item) {
		itens.add(item);
	}
	
	double obterValorDaCompra() {
		double valorCompra = 0;
		for(Item item : itens) {
			valorCompra += item.obterValorDoItem();
		}
		return valorCompra;
	}
}
