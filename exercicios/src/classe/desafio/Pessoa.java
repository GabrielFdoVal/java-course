package classe.desafio;

public class Pessoa {

	String nome;
	double pesoAtual;
	final double pesoInicial;
	
	Pessoa(String nome, double pesoInicial) {
		this.nome = nome;
		this.pesoInicial = pesoInicial;
		pesoAtual = pesoInicial;
	}
	
	String comer(Comida c) {
		pesoAtual += c.peso;
		return "\n"+nome+" comeu "+c.peso+"g de "+c.nome;
	}
	
	String pesoAtual() {
		return "\nNome: "+nome+"\nPeso inicial: "+pesoInicial+"\nPeso atual: "+pesoAtual;
	}
}
