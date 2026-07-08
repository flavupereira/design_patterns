package padreosestruturais.facade;

public class ServicoEmail {

	public void conectarSmtp() {
		System.out.println("Conectando ao servidor SMTP (porta 587)...");
	}
	
	public void enviar(byte[] anexo, String destinatario) {
		System.out.println("E-mail enviado com sucesso para " + destinatario + "com o PDF anexo. ");
	}
}
