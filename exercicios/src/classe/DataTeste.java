package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(28,3,2002);
		
		System.out.println(d1.obterDataFormatada());
		
		Data d2 = new Data();
		
		d2.imprimirDataFormatada();
	}
}
