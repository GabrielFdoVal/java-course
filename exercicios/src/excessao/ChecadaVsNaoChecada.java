package excessao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		geraErro1();
		
		
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void geraErro1() {
	 	throw new RuntimeException("Erro 1");
	}
	
	static void geraErro2() throws Exception {
		throw new Exception("Erro 2");
	}
}
