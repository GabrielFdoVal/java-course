package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		
		CaixaInt caixaA = new CaixaInt();
		
		caixaA.guardarObjeto(1);
		
		System.out.println(caixaA.abrir());
	}
}
