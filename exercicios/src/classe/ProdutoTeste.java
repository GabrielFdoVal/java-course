package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 4356.89);
		
		System.out.println(p1.precoComDesconto(0.1));		
		
		var p2 = new Produto("Caneta Preta",1.35);
		
		System.out.println(p2.precoComDesconto());
		
		Produto.desconto = 0.30;
		
		System.out.println(p1.precoComDesconto(0.1));
		System.out.println(p2.precoComDesconto());
	}
}
