package arraysEcolections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conjunto {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>();
		
		lista.add("Ana");
		lista.add("Carl");
		lista.add("Luca");
		
		for(String nome: lista) {
			System.out.println(nome);
		}
		
		SortedSet<String> lista2 = new TreeSet<>();
		
		lista2.add("Ana");
		lista2.add("Carl");
		lista2.add("Luca");
		
		for(String nome: lista2) {
			System.out.println(nome);
		}
	}
}
