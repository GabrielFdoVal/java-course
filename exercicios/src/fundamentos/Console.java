package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Digite o seu nome: ");
		
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Digite seu salario: ");
		double salario = entrada.nextDouble();
		
		System.out.printf("\nNome: %s \nIdade: %d\nSalario: %.2f", nome, idade, salario);
		entrada.close();
	}
}
