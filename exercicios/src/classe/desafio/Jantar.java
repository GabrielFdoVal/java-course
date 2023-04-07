package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Gabriel", 100.0);		
		Comida c1 = new Comida("Arroz", 0.3);
		Comida c2 = new Comida("Feijao", 0.2);
		
		System.out.println(p.comer(c1));
		System.out.println(p.pesoAtual());
		
		System.out.println(p.comer(c2));
		System.out.println(p.pesoAtual());
		
	}
}
