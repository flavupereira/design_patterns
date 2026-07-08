package padreosestruturais.proxy;

public class SistemaApp {
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("--- Passo 1: Inicializando a tela do sistema ---");
		Relatorio relatorioAnual = new RelatorioProxy("Faturamento_2025.pdf");
		
		System.out.println("\n--- Passo 2: O usuário está navegando na tela e ainda não clicou no relatório ---");
		
		System.out.println("\n--- Passo 3: O usuário clicou para visualizar o relatório ---");
		relatorioAnual.Exibir();
		
		System.out.println("\n--- Passo 4: O usuário clicou para visualizar novamente ---");
		relatorioAnual.Exibir();
		
	}

}
