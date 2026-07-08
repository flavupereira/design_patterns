package padroescriacionais.abstractfactory.fabrica;

import padroescriacionais.abstractfactory.Cadeira;
import padroescriacionais.abstractfactory.Sofa;

public interface FabricaDeMoveis {
	
	Cadeira CriaarCadeira();
	Sofa CriarSofa();

}
