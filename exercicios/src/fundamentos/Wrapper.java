package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 1;
		Short s = 1000;
		
		
		Integer i = Integer.parseInt(entrada.next());
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l * 3);
		
		Float f = 123.1F;
		System.out.println(f);
		
		Double d = 123.0;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '#';
		System.out.println(c);
		
		entrada.close();
	}
}
