package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoComDesconto = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? valor * 1.085 : valor;
		UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
		UnaryOperator<Double> arredondar = valor -> Math.round(valor * 100.0) / 100.0;
		Function<Double, String> formatar = valor -> "R$"+valor.toString().replace(",", ".");
		
		String resultado = precoComDesconto
					.andThen(impostoMunicipal)
					.andThen(frete)
					.andThen(arredondar)
					.andThen(formatar)
					.apply(p);
		
		System.out.println(resultado);
	}
}
