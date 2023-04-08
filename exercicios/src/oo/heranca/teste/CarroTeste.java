package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c = new Civic();
		Ferrari f = new Ferrari(315);
		f.ligarTurbo();
		
		System.out.println(c.velocidadeAtual);
		System.out.println(f.velocidadeAtual);
		
		c.acelerar();
		f.acelerar();
		
		System.out.println("\n"+c.velocidadeAtual);
		System.out.println(f.velocidadeAtual);
		
		c.frear();
		f.frear();
		
		System.out.println("\n"+c.velocidadeAtual);
		System.out.println(f.velocidadeAtual);
		
		c.frear();
		f.frear();
		c.frear();
		f.frear();
		c.frear();
		f.frear();
		c.frear();
		f.frear();
		
		System.out.println("\n"+c.velocidadeAtual);
		System.out.println(f.velocidadeAtual);
	}
}
