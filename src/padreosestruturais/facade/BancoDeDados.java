package padreosestruturais.facade;

public class BancoDeDados {
	
	
	public String buscarDados(String relatorioId) {
		System.out.println("Buscando dados do banco de Dados "+ relatorioId + " no banco...");
		
		return "Dados : [Venda = 50.000 , Lucro = 15.000  ]";
	}

}
