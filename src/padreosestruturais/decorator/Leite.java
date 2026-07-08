package padreosestruturais.decorator;

public class Leite extends CafeDecorator {

	public Leite(Cafe cafe) {
		super(cafe);
	}
	
	public double getPreco() {
		return super.getPreco() + 1.50;
		
	}
	
	public String getDescricao() {
		return super.getDescricao() + ", Leite ";
		
	}

}
