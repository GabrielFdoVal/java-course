package fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {
		boolean trab1 = false;
		boolean trab2 = false;
		
		boolean comprouTv50 = trab1 && trab2;
		boolean comprouTv32 = trab1 ^ trab2;
		boolean comprouSorvete = trab1 || trab2;
		
		System.out.println("Comprou tv 50? "+comprouTv50);
		System.out.println("Comprou tv 32? "+comprouTv32);
		System.out.println("Comporu sorvete? "+comprouSorvete);
	}
}
