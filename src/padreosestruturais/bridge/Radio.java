package padreosestruturais.bridge;

public class Radio implements Dispositivo {
	
	private boolean ligado = false;
	private int volume = 5;

	@Override
	public void ligar() {
		ligado = true;
		System.out.println("Radio Ligado");
		
	}

	@Override
	public void desligar() {
		ligado = false;
		System.out.println("Radio Desligado");
		
	}

	@Override
	public void aumentarVolume() {
		if (ligado && volume < 50) {
			volume += 2;
			System.out.println("Volume do Radio " + volume);
		}
	}

	@Override
	public void diminuirVolume() {
		if(ligado && volume > 0) {
			volume -=2;
			System.out.println("Volume do Radio " + volume);
		}
		
	}

	@Override
	public boolean estaLigado() {
		
		return ligado;
	}

	@Override
	public int getVolume() {
		
		return volume;
	}

	@Override
	public String getNome() {
		
		return "Radio";
	}

}
