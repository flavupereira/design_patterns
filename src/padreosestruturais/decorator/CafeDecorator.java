package padreosestruturais.decorator;

public abstract class CafeDecorator implements Cafe {
	protected Cafe cafeDecorado;

	public CafeDecorator(Cafe cafeDecorado) {
		this.cafeDecorado = cafeDecorado;
	}
	
	public double getPreco() {
		return cafeDecorado.getPreco();
		
	}
	
	public String getDescricao() {
		return cafeDecorado.getDescricao();
		
	}

}
