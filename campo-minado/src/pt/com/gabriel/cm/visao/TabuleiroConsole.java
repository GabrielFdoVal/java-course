package pt.com.gabriel.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import pt.com.gabriel.cm.excessao.ExplosaoException;
import pt.com.gabriel.cm.excessao.SairException;
import pt.com.gabriel.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner scanner = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {
		// TODO Auto-generated method stub
		try {
			boolean continuar = true;
			
			while(continuar) {
				cicloJogo();
				
				System.out.println("Outra partida? (S/n): ");
				String resposta = scanner.nextLine();
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
			
		} catch(SairException e) {
			System.out.println("Tchau :p");
		} finally {
			scanner.close();
		}
	}

	private void cicloJogo() {
		// TODO Auto-generated method stub
		try {
			
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValor("Digite (x, y); ");
				
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
												.map(e -> Integer.parseInt(e.trim()))
												.iterator();
				
				digitado = capturarValor("1- Abrir ou 2- (Des)Marcar: ");
				
				if("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				} else if("2".equals(digitado)) {
					tabuleiro.toggleMarcar(xy.next(), xy.next());
				}
			}

			System.out.println(tabuleiro);
			System.out.println("Voce ganhou");
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Voce perdeu");
		}
	}
	
	private String capturarValor(String texto) {
		System.out.print(texto);
		String digitado = scanner.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		
		return digitado;
	}
}
