package br.com.gabriel.app.financeiro;

import java.util.ServiceLoader;

public class Teste {

	public static void main(String[] args) {
//		CalculadoraImpl calc = new CalculadoraImpl();
//		System.out.println(calc.soma(5,4));
//		
//		OperacoesAritimeticas op = new OperacoesAritimeticas();
//		System.out.println(op.soma(2,6,8));
		
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		System.out.println(calc.soma(2,3,4));
		
	}
}
