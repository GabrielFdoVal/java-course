package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardarObjeto(2.3);
		System.out.println(caixaA.abrir());
		
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardarObjeto(2);
		System.out.println(caixaB.abrir());
		
	}
}
