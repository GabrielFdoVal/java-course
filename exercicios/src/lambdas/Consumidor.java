package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	 public static void main(String[] args) {
		
		 Consumer<Produto> imprimir = valor -> System.out.println(valor.nome);
		 
		 Produto produto1 = new Produto("Notebook", 1627.11, 0.25);
		 Produto produto2 = new Produto("Notebook1", 1627.11, 0.25);
		 Produto produto3 = new Produto("Notebook2", 1627.11, 0.25);
		 Produto produto4 = new Produto("Notebook3", 1627.11, 0.25);
		 Produto produto5 = new Produto("Notebook4", 1627.11, 0.25);
		 imprimir.accept(produto1);
		 
		 List<Produto> produtos = Arrays.asList(produto1,produto2,produto3,produto4,produto5);
		 
		 produtos.forEach(imprimir);
		 produtos.forEach(p -> System.out.println(p.nome));
	}
}
