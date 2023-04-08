package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0 ? true : false;
		
		Predicate<Integer> isTresNumeros = num -> num >= 100 ? true : false;
		
		System.out.println(isPar.and(isTresNumeros).negate().test(123));
		System.out.println(isPar.or(isTresNumeros).test(123));
	}
}
