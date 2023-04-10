package padroes.observer;

public class Namorada implements ChegadaAniversarianteObservador {

	@Override
	public void chegou(EventoChegadaAniversariante e) {
		// TODO Auto-generated method stub
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco....");
		System.out.println("e... Surpresa!!!");
	}
}
