package padreosestruturais.bridge;

public class TV implements Dispositivo{
	
	private boolean ligado = false;
	private int volume = 10;

	@Override
	public void ligar() {
		ligado = true;
		System.out.println("TV ligada");
		
	}

	@Override
	public void desligar() {
		ligado = false;
		System.out.println("TV desligada");
		
	}

	@Override
	public void aumentarVolume() {
		if(ligado && volume < 100) {
			volume += 5;
			System.out.println("Volume da TV" + volume);
		}
		
	}

	@Override
	public void diminuirVolume() {
		if(ligado && volume > 0 ) {
			volume -= 5;
			System.out.println("Volume da TV " + volume);
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
		
		return "TV";
	}

}
