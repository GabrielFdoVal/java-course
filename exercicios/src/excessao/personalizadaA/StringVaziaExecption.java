package excessao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaExecption extends RuntimeException {

	private String nomeDoAtributo;
	
	public StringVaziaExecption(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s esta vazio", nomeDoAtributo);
	}
}
