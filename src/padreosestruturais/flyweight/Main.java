package padreosestruturais.flyweight;

public class Main {
	
	public static void main(String[] args) {
		
		TipoArvore carvalho = FabricaDeArvores.getTipoArvore("Carvalho", "Verde Escuro", "textura_madeira_1.png");
		
		Arvore a1 = new Arvore(10, 20, carvalho);
		Arvore a2 = new Arvore(15, 35, carvalho);
		Arvore a3 = new Arvore(50, 50, carvalho);
		
		a1.desenhar();
		a2.desenhar();
		a3.desenhar();
		
	}

}
