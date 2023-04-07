package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double num1 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		
		System.out.print("Digite o segundo numero: ");
		double num2 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		
		System.out.print("Digite o simbolo: ");
		String simbolo = scanner.nextLine();
		
		double result = simbolo.equals("+") ? num1 + num2 : 0.0;
		result = simbolo.equals("-") ? num1 - num2 : result;
		result = simbolo.equals("*") ? num1 * num2 : result;
		result = simbolo.equals("/") ? num1 / num2 : result;
		result = simbolo.equals("%") ? num1 % num2 : result;
		
		System.out.printf("O resultado de %.2f %s %.2f e igual a %.2f", num1, simbolo, num2, result);
		
		scanner.close();
	}
}
