package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (F - 32) * 5/9 = C
		
		double fTemp = 86, cTemp;
		final double fator = 5 / 9.0, ajuste = 32;
		
		cTemp = (fTemp - ajuste) * fator;
		
		System.out.println(cTemp+"°C.á");
	}
}
