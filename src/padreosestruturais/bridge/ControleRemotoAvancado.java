package padreosestruturais.bridge;

public class ControleRemotoAvancado extends ControleRemoto{

	
	
    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void mostrarStatus() {
        System.out.println("\n=== STATUS DO " + dispositivo.getNome().toUpperCase() + " ===");
        System.out.println("Ligado: " + (dispositivo.estaLigado() ? "SIM" : "NÃO"));
        System.out.println("Volume: " + dispositivo.getVolume());
        System.out.println("================================\n");
    }
    
    
    public void silenciar() {
        if (dispositivo.estaLigado()) {
            System.out.println(dispositivo.getNome() + " silenciado!");
           
            while (dispositivo.getVolume() > 0) {
                dispositivo.diminuirVolume();
            }
        } else {
            System.out.println(dispositivo.getNome() + " está desligado, não é possível silenciar!");
        }
    }
    
  
    
    
   
    
   
}
	
	
	

