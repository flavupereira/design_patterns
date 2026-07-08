package padreosestruturais.bridge;

public abstract class ControleRemoto {
	protected Dispositivo dispositivo;

	public ControleRemoto(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	
    public void ligar() {
    	dispositivo.ligar();
    }
    
    
    public void desligar() {
    	dispositivo.desligar();
    }
    
    public void aumentarVolume() {
    	dispositivo.aumentarVolume();
     }
    
    
    public void diminuirVolume() {
    	dispositivo.diminuirVolume();
    }
    
    public abstract void mostrarStatus();
}
