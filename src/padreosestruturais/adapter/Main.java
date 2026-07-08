package padreosestruturais.adapter;

public class Main {

	public static void main(String[] args) {
		
		String dadosDoCliente = "{\"nome\": \"Carlos\", \"status\": \"Ativo\"}";
		
		AnalisadorDados analisadorPadrao = new AnalisadorInterno();
		analisadorPadrao.analisadorDeDadosJson(dadosDoCliente);
		
		
		System.out.println("--------------------------------------------");
		
		
		
        BibliotecaSuperAnaliseXML bibliotecaExterna = new BibliotecaSuperAnaliseXML();
        
        // CORREÇÃO: Passe a variável SEM ASPAS para o adaptador
        AnalisadorDados adptador = new JsonParaXmlAdapter(bibliotecaExterna); 
        
        // Agora vai funcionar perfeitamente!
        adptador.analisadorDeDadosJson(dadosDoCliente);
    }
	

		
		
			}


