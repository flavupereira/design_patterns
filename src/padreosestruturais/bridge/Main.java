package padreosestruturais.bridge;


public class Main {

	public static void main(String[] args) {
		
		 System.out.println("TESTANDO PADRÃO BRIDGE\n");
		 
		 Dispositivo tv = new TV();
		 Dispositivo radio = new Radio();
		 
		 ControleRemoto controleTV = new ControleRemotoAvancado(tv);
	     ControleRemoto controleRadio = new ControleRemotoAvancado(radio);
		 
		 
		
		 
		 System.out.println("Controle TV");
		 controleTV.ligar();
		 controleTV.aumentarVolume();
		 controleTV.aumentarVolume();
		 controleTV.aumentarVolume();
		 controleTV.mostrarStatus();
		 
		 ((ControleRemotoAvancado) controleTV).silenciar();
		 controleTV.mostrarStatus();
		 
		 
		 
		 System.out.println("Controle Radio");
		 
		 controleRadio.ligar();
		 controleRadio.aumentarVolume();
		 controleRadio.aumentarVolume();
		 controleRadio.aumentarVolume();
		 
		 controleRadio.desligar();
		 controleRadio.mostrarStatus();
		 
		
	}

}
