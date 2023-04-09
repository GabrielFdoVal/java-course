package excessao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.println(7 / Double.parseDouble(scanner.nextLine()));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
