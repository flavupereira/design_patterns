package padreosestruturais.flyweight;

public class TipoArvore {
	
	private String nome;
	private String cor;
	private String texturaTronco;
	
	
	
	public TipoArvore(String nome, String cor, String texturaTronco) {
		this.nome = nome;
		this.cor = cor;
		this.texturaTronco = texturaTronco;
	}
	
	
	public void desenhar(int x , int y) {
		System.out.println("Desenhando árvore '" + nome + "' [" + cor + "] na posição (" + x + ", " + y + ")");
	}
	
	

}
