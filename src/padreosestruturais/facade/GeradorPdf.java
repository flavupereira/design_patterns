package padreosestruturais.facade;

public class GeradorPdf {
	
	public byte[] gerarPdf(String dados) {
		
		System.out.println("Renderizando documento PDF com os dados... ");
		System.out.println("Aplicando estilos, margens e fontes... ");
		return "PDF_CONTEUDO_BINARIO".getBytes();
		
	}

}
