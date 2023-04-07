package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salario: ");
		double sal1 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		
		System.out.print("Informe o segundo salario: ");
		double sal2 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		
		System.out.print("Informe o terceiro salario: ");
		double sal3 = Double.parseDouble(scanner.nextLine().replace(",", "."));
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.println("A media dos salarios e: " + media);
		
		scanner.close();
	}
}
