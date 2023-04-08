package classe;

public class Equals {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Gabriel", "gabriel@email.com");
		Usuario u2 = new Usuario("Gabriel", "gabriel@email.com");
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		
	}
}
