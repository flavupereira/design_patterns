package abstractfactory.fabria;

import abstractfactory.Cadeira;
import abstractfactory.CadeiraModerna;
import abstractfactory.Sofa;
import abstractfactory.SofaModerno;

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
