import java.util.*;


public class EventoCreator {

	public static void main(String[] args) {
		// Cria��o de exemplo de evento
		Evento evento = new Evento();

		// Chamar m�todo que define atributos do evento
		evento.setDadosEventos();
		
		// Cria��o de exemplos de palestras
		Evento.Palestra palestra = evento.new Palestra();
		Evento.Palestra palestra1 = evento.new Palestra();
		Evento.Palestra palestra2 = evento.new Palestra();
		
		// Chamar m�todo que define atributos das palestras
		palestra.setDadosPalestra();
		palestra1.setDadosPalestra();
		palestra2.setDadosPalestra();
		
		// Getters
		evento.getPalestrasDados();
		evento.getListaComparativaPrecos();
	}
}