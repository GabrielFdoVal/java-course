package br.com.gabriel.app.calculo;

import br.com.gabriel.app.Calculadora;
import br.com.gabriel.app.calculo.interno.OperacoesAritimeticas;
import br.com.gabriel.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {

	private OperacoesAritimeticas opa = new OperacoesAritimeticas();

	public Double soma(double... numbers) {
		Logger.info("Somando...");
		return opa.soma(numbers);
	}
	
	
}
