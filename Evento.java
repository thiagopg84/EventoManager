import java.util.*;

public class Evento {
	String nomeEvento;
	String nomeResponsavelEvento;
	String telResponsavelEvento;
	String dataInicioEvento;
	String dataFimEvento;
	double valorHoraResponsavel;
	double cargaHorariaEvento;
	double custoTotal = 0;
	String listaTotalPalestras = "Lista de palestras: ";
	
	ArrayList<Double> arrCustoTotalPalestras = new ArrayList<>();
	ArrayList<String> listaPalestras = new ArrayList<>();
	ArrayList<String> listaCustoIndividualPalestras = new ArrayList<>();
	List<Palestra> lista = new ArrayList<>();
	
	public void getListaComparativaPrecos() {
		Evento.Palestra palestra =  Collections.max(lista, Comparator.comparing(s -> s.getCost()));
        System.out.println("A palestra mais cara foi : " + palestra.palestraTitulo + " que custou R$ " + palestra.getCost());

        palestra =  Collections.min(lista, Comparator.comparing(s -> s.getCost()));
        System.out.println("A palestra mais barata foi : " + palestra.palestraTitulo + " que custou R$ " + palestra.getCost());
	}

	public void getPalestrasDados() {
		for (int i = 0; i < arrCustoTotalPalestras.size(); i++) {
			 custoTotal += arrCustoTotalPalestras.get(i);
		}
		System.out.println("O custo total das palestras foi R$ " + custoTotal); 
		
		for (int i = 0; i < listaPalestras.size(); i++) {
			 listaTotalPalestras += "\n" + "- " + listaPalestras.get(i);
		}
		System.out.println(listaTotalPalestras);
		
		for (int i = 0; i < listaCustoIndividualPalestras.size(); i++) {
			System.out.println(listaCustoIndividualPalestras.get(i));
		}
	}

	public void setDadosEventos() {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Nome do evento: ");
		nomeEvento = keyboard.nextLine();
		
		System.out.print("Nome do responsável pelo evento: ");
		nomeResponsavelEvento = keyboard.nextLine();
		
		System.out.print("Contato do responsável pelo evento: ");
		telResponsavelEvento = keyboard.nextLine();
		
		System.out.print("Data de início do evento: ");
		dataInicioEvento = keyboard.nextLine();
		
		System.out.print("Data do final do evento: ");
		dataFimEvento = keyboard.nextLine();
		
		System.out.print("Valor/Hora do responsável pelo evento: ");
		valorHoraResponsavel = keyboard.nextDouble();
		
		System.out.print("Carga horária do evento: ");
		cargaHorariaEvento = keyboard.nextDouble();
		
        this.nomeEvento = nomeEvento;
        this.nomeResponsavelEvento = nomeResponsavelEvento;
        this.telResponsavelEvento = telResponsavelEvento;
        this.dataInicioEvento = dataInicioEvento;
        this.dataFimEvento = dataFimEvento;
        this.valorHoraResponsavel = valorHoraResponsavel;
        this.cargaHorariaEvento = cargaHorariaEvento;
        
        System.out.println(this.nomeResponsavelEvento + ", responsável pelo evento " + "\"" + this.nomeEvento +"\"" + ", custou R$ " + (this.cargaHorariaEvento * this.valorHoraResponsavel));
    }
	
	public class Palestra {
		String palestraTitulo;
		String palestraHorarioInicio;
		String palestranteNome;
		String palestranteContato;
		String palestraDescricao;
		double palestranteValorHora;
		double palestraCargaHoraria;
		double custoPalestra = 0;
		
		
		public double getCost() {
			return this.custoPalestra;
		}

		public void setDadosPalestra() {
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("Título palestra: ");
			palestraTitulo = keyboard.nextLine();
			
			System.out.print("Horário de iníco da palestra: ");
			palestraHorarioInicio = keyboard.nextLine();
			
			System.out.print("Nome do palestrante: ");
			palestranteNome = keyboard.nextLine();
			
			System.out.print("Contato do palestrante: ");
			palestranteContato = keyboard.nextLine();
			
			System.out.print("Descrição da palestra: ");
			palestraDescricao = keyboard.nextLine();
			
			System.out.print("Valor/hora do palestrante: ");
			palestranteValorHora = keyboard.nextDouble();
			
			System.out.print("Carga horária da palestra: ");
			palestraCargaHoraria = keyboard.nextDouble();
			
			this.palestraTitulo = palestraTitulo;
	        this.palestraHorarioInicio = palestraHorarioInicio;
	        this.palestranteNome = palestranteNome;
	        this.palestranteContato = palestranteContato;
	        this.palestraDescricao = palestraDescricao;
	        this.palestranteValorHora = palestranteValorHora;
	        this.palestraCargaHoraria = palestraCargaHoraria;
	        this.custoPalestra = this.palestranteValorHora * this.palestraCargaHoraria;
	        
	        arrCustoTotalPalestras.add(this.palestranteValorHora * this.palestraCargaHoraria);
	        listaCustoIndividualPalestras.add("O custo da palestra " + this.palestraTitulo + " foi R$ " + this.custoPalestra);
	        listaPalestras.add(this.palestraTitulo);
	        lista.add(this);
		}
	}
}