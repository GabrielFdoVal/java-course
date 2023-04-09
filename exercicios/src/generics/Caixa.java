package generics;

public class Caixa<TIPO> {

	private TIPO coisa;
	
	public void guardarObjeto(TIPO coisa) {
		this.coisa = coisa;
	}
	
	public TIPO abrir() {
		return coisa;
	}
}
