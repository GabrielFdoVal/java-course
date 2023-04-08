package oo.desafio;

public class Item {

	Produto produto;
	int qtde;
	
	Item(Produto produto, int qtde) {
		this.produto = produto;
		this.qtde = qtde;
	}
	
	double obterValorDoItem() {
		return qtde * produto.preco;
	}
}
