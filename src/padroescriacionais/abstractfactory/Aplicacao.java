package padroescriacionais.abstractfactory;

import padroescriacionais.abstractfactory.fabrica.FabricaDeMoveis;
import padroescriacionais.abstractfactory.fabrica.FabricaModerna;
import padroescriacionais.abstractfactory.fabrica.FabricaRetro;

public class Aplicacao {
	
	private Cadeira cadeira;
	private Sofa sofa;
	
	public Aplicacao(FabricaDeMoveis fabrica) {
		this.cadeira = fabrica.CriaarCadeira();
		this.sofa = fabrica.CriarSofa();
	}
	
	public void executar() {
		cadeira.sentar();
		sofa.deirar();
	}
	
	public static void main(String[] args) {
		
		FabricaDeMoveis fabrica = new FabricaRetro();
	    Aplicacao app = new Aplicacao(fabrica);
		app.executar();
	}

}
