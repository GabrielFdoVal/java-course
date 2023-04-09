package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook1", 1000.00, 0.2, false);
		Produto p2 = new Produto("Notebook2", 1000.00, 0.3, false);
		Produto p3 = new Produto("Notebook3", 1000.00, 0.2, true);
		Produto p4 = new Produto("Notebook4", 1000.00, 0.3, true);
		
		Predicate<Produto> desconto = p -> p.desconto >= 0.3;
		Predicate<Produto> frete = p -> p.freteGratis;
		Function<Produto, String> imprimir = p -> {
			double precoDesconto = p.preco * (1 - p.desconto);
			return "Nome: "+p.nome+"\nPreco com Desconto: R$"+precoDesconto+"\nFrete Gratis: "+p.freteGratis;
		};
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4);
		
		produtos.stream()
			.filter(desconto)
			.filter(frete)
			.map(imprimir)
			.forEach(System.out::println);
		
	}
}
