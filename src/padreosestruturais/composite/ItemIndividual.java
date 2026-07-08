package padreosestruturais.composite;

public class ItemIndividual implements ComponenteMenu {
      private String nome;
      private double preco;
      
      
	
	public ItemIndividual(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String getNome() {
		
		return this.nome;
	}

	@Override
	public double getPreco() {
		
		return this.preco;
	}

}
