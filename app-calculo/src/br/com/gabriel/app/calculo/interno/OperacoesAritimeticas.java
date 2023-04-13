package br.com.gabriel.app.calculo.interno;

import java.util.Arrays;

public class OperacoesAritimeticas {

	public Double soma(double... numbers) {
		return Arrays.stream(numbers).reduce(0.0, (t, a) -> t + a);
	}
}
