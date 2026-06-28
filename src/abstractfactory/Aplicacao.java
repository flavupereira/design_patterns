package abstractfactory;

import abstractfactory.fabria.FabricaDeMoveis;
import abstractfactory.fabria.FabricaModerna;
import abstractfactory.fabria.FabricaRetro;

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
