package padroescriacionais.buider;

public class Main {
	
	
	public static void main(String[] args) {
		
		Carro meuCarro = new Carro.carroBuilder()
				.motor("v5")
				.possuiArCondicionado(false)
				.buid();
		
		System.out.println(meuCarro);
	}

}
