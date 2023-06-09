package pt.com.gabriel.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import pt.com.gabriel.cm.excessao.ExplosaoException;

public class Campo {

	private final int linha;
	private final int coluna;
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
	
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaColuna + deltaLinha;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if(deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		}
		return false;
	}
	
	void toggleMarcacao() {
		if(!aberto) {
			marcado = !marcado; 
		}
	}
	
	boolean abrir() {
		if(!aberto && !marcado) {
			aberto = true;			
			if(minado) {
				throw new ExplosaoException();
			}			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());
			}
			return true;
		} else {

			return false;
		}
	}
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado);
	}
	
	public boolean isMarcado() {
		return marcado;
	}
	
	void minar() {
		minado = true;
	}
	
	public boolean isAberto() {
		return aberto;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protejido = minado && marcado;
		return desvendado || protejido;
	}
	
	long minasVizinhanca() {
		return vizinhos.stream().filter(v -> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	public boolean isMinado() {
		return minado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public String toString() {
		if(marcado) {
			return "X";
		} else if(aberto && minado) {
			return "*";
		} else if(aberto && minasVizinhanca() > 0) {
			return Long.toString(minasVizinhanca());
		} else if(aberto) {
			return " ";
		} else {
			return "?";
		}
	}
}
