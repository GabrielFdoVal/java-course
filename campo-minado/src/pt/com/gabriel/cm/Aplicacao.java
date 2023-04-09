package pt.com.gabriel.cm;

import pt.com.gabriel.cm.modelo.Tabuleiro;
import pt.com.gabriel.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		
		new TabuleiroConsole(tabuleiro);
	}
}
