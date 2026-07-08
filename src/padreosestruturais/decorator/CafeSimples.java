package padreosestruturais.decorator;

public class CafeSimples implements Cafe {

	@Override
	public double getPreco() {
		return 5.00;
	}

	
	@Override
	public String getDescricao() {
		return "Café Simples";
	}

}
