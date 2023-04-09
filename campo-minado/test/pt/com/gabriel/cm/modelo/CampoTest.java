package pt.com.gabriel.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pt.com.gabriel.cm.excessao.ExplosaoException;

class CampoTest {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}

	@Test
	void vizinhoDistanciaUm() {
		Campo vizinho = new Campo(3, 2);		
		boolean result = campo.adicionarVizinho(vizinho);		
		assertTrue(result);
	}
	
	@Test
	void vizinhoDistanciaDois() {
		Campo vizinho = new Campo(2, 2);		
		boolean result = campo.adicionarVizinho(vizinho);		
		assertTrue(result);
	}
	
	@Test
	void NaoVizinho() {
		Campo vizinho = new Campo(1, 1);		
		boolean result = campo.adicionarVizinho(vizinho);		
		assertFalse(result);
	}
	
	@Test
	void valorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void toggleMarcado() {
		campo.toggleMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void toggleMarcadoDuasChamadas() {
		campo.toggleMarcacao();
		campo.toggleMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void abrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void abrirNaoMinadoMarcado() {
		campo.toggleMarcacao();
		assertFalse(campo.abrir());
	}

	@Test
	void abrirMinadoMarcado() {
		campo.toggleMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void abrirMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> campo.abrir());
	}
	
	@Test
	void abrirComVizinho() {
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	@Test
	void naoAbrirVizinhoMinado() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		assertTrue(campo22.isAberto() && !campo11.isAberto());
	}
}
