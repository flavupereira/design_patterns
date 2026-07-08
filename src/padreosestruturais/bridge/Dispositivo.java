package padreosestruturais.bridge;

public interface Dispositivo {
	
	void ligar();
	void desligar();
	void aumentarVolume();
	void diminuirVolume();
	boolean estaLigado();
	int getVolume();
	String getNome();

}
