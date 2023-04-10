package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private final List<ChegadaAniversarianteObservador> observadores = new ArrayList<>();
	
	public void registrarObservador(ChegadaAniversarianteObservador o) {
		observadores.add(o);
	}
	
	public void monitorar() {
		Scanner scanner = new Scanner(System.in);
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou?");
			valor = scanner.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				//notificar observadores;
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("Alarme falso");
			}
		}
		
		scanner.close();
	}
}
