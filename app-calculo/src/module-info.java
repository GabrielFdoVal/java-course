import br.com.gabriel.app.calculo.CalculadoraImpl;

module app.calculo {
	exports br.com.gabriel.app.calculo;
	requires transitive app.loging;
	
	exports br.com.gabriel.app.calculo.interno
		to app.financeiro;
	
	opens br.com.gabriel.app.calculo to app.financeiro;
	
	requires app.api;
	provides br.com.gabriel.app.Calculadora
		with CalculadoraImpl;
}