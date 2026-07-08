package padroescriacionais.abstractfactory.fabrica;

import padroescriacionais.abstractfactory.Cadeira;
import padroescriacionais.abstractfactory.CadeiraModerna;
import padroescriacionais.abstractfactory.Sofa;
import padroescriacionais.abstractfactory.SofaModerno;

public class FabricaModerna implements FabricaDeMoveis{

	@Override
	public Cadeira CriaarCadeira() {
		// TODO Auto-generated method stub
		return new CadeiraModerna();
	}

	@Override
	public Sofa CriarSofa() {
		// TODO Auto-generated method stub
		return new SofaModerno();
	}

}
