package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {
	
	public Ferrari() {
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
	
	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		delta = 35;
	}
	
	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		delta = 15;
	}

//	@Override
//	void acelerar() {
//		super.acelerar();
//	}
}
