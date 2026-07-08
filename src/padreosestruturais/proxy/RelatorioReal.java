package padreosestruturais.proxy;

public class RelatorioReal implements Relatorio {
	
    private String nomeArquivo;
    
    
	public RelatorioReal(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		carregarDoBancoDeDados();
	}

	
	private void carregarDoBancoDeDados() {
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Relatório carregado com sucesso ");
	}

	@Override
	public void Exibir() {
		System.out.println("Exibindo os gráficos do relatório : " + nomeArquivo);
		
	}

}
