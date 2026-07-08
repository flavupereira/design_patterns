package padreosestruturais.facade;

public class Main {
	
	public static void main(String[] args) {
		
		RelatorioFacade facade = new RelatorioFacade();
		
		facade.enviarRelatorioMensal("REL_2026_JULHO", "chefe@empresa.com");
	}

}
