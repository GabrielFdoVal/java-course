package br.com.gabriel.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador	 {

	void valorAlterado(String novoValor);
}
