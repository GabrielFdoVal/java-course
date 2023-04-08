package oo.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	Compra novaCompra() {
		Compra compra = new Compra();
		compras.add(compra);
		return compra;
	}
	
	double obterValorTotal() {
		double valorTotal = 0;
		for(Compra compra : compras) {
			valorTotal += compra.obterValorDaCompra();
		}
		return valorTotal;
	}
}
