package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardarObjeto(2.3);
		
		Integer coisaa = (Integer) caixaA.abrir();
		System.out.println(coisaa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardarObjeto("A");
		
		String coisab = (String) caixaB.abrir();
		System.out.println(coisab);
	}
}
