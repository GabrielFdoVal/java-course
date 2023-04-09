package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Integer> print = System.out::println;
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Function<Integer, String> binario = num -> Integer.toBinaryString(num);
		UnaryOperator<String> inverter = text -> new StringBuilder(text).reverse().toString();
		Function<String, Integer> decimal = text -> Integer.parseInt(text, 2);
		
		nums.stream()
			.map(binario)
			.map(inverter)
			.map(decimal)
			.forEach(print);
		
	}
}
