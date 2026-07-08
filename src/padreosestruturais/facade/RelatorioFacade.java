package padreosestruturais.facade;

public class RelatorioFacade {
	private BancoDeDados bancoDeDados;
	private GeradorPdf geradorPdf;
	private ServicoEmail servicoEmail;
	
	
	public RelatorioFacade() {
		this.bancoDeDados = new BancoDeDados();
		this.geradorPdf = new GeradorPdf();
		this.servicoEmail = new ServicoEmail();
	}

	
	public void enviarRelatorioMensal(String relatorioId , String emailDestinatario) {
		
		System.out.println("=== Iniciando Processo via Facade ===");
		
		String dados = bancoDeDados.buscarDados(relatorioId);
		byte[] pdf = geradorPdf.gerarPdf(dados);
		
		servicoEmail.conectarSmtp();
		servicoEmail.enviar(pdf, emailDestinatario);
		
		System.out.println("=== Processo Finalizado com Sucesso ===\n");
		
	}
}
