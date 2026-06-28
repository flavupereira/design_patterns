package abstractfactory.fabria;

import abstractfactory.Cadeira;
import abstractfactory.Sofa;

public interface FabricaDeMoveis {
	
	Cadeira CriaarCadeira();
	Sofa CriarSofa();

}
