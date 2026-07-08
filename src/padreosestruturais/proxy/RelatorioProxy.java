package padreosestruturais.proxy;

public class RelatorioProxy implements Relatorio{

	private RelatorioReal relatorioReal;
	private String nomeArquivo;
	
	
	
	public RelatorioProxy(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		
		System.out.println("Proxy criado para o relatório: " + nomeArquivo + "(Memória poupada)");
	}





	@Override
	public void Exibir() {
		if(relatorioReal == null) {
			relatorioReal = new RelatorioReal(nomeArquivo);
		}
		
		relatorioReal.Exibir();
	}

}
