package jdbc;

public class Pessoa {

	private int codido;
	private String nome;
	
	public Pessoa(int codido, String nome) {
		super();
		this.codido = codido;
		this.nome = nome;
	}
	
	public int getCodido() {
		return codido;
	}
	public void setCodido(int codido) {
		this.codido = codido;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
}
