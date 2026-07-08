package padreosestruturais.decorator;

public class Chocolate extends CafeDecorator{

	public Chocolate(Cafe cafe) {
		super(cafe);
		
	}

	
	public double getPreco() {
		return super.getPreco() + 2.00;
		
	}
	
	
	public String getDescricao() {
		return super.getDescricao() + ", Chocolate";
		
	}
}
