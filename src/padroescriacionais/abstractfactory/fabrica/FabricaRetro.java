package padroescriacionais.abstractfactory.fabrica;

import padroescriacionais.abstractfactory.Cadeira;
import padroescriacionais.abstractfactory.CadeiraRetro;
import padroescriacionais.abstractfactory.Sofa;
import padroescriacionais.abstractfactory.SofaRetro;

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
