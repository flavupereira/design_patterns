package abstractfactory.fabria;

import abstractfactory.Cadeira;
import abstractfactory.CadeiraRetro;
import abstractfactory.Sofa;
import abstractfactory.SofaRetro;

public class FabricaRetro implements FabricaDeMoveis {

	@Override
	public Cadeira CriaarCadeira() {
		
		return new CadeiraRetro();
	}

	@Override
	public Sofa CriarSofa() {
		
		return new SofaRetro();
	}

}
