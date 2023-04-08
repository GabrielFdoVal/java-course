package arraysEcolections;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de notas: ");
		int qtdNotas = Integer.parseInt(scanner.nextLine());
		
		double[] notas = new double[qtdNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("\nDigite a nota "+(i+1)+": ");
			notas[i] = Double.parseDouble(scanner.nextLine());
		}
		
		double somaNotas = 0;
		for(double nota: notas) {
			somaNotas += nota;
		}
		
		double media = somaNotas / notas.length;
		
		System.out.println("\nA media do aluno e: "+media);
		
		scanner.close();
	}
}
