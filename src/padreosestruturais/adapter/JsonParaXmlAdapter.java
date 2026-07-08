package padreosestruturais.adapter;

public class JsonParaXmlAdapter implements AnalisadorDados{
	private BibliotecaSuperAnaliseXML bibliotecaXml;
	
	
	
	public JsonParaXmlAdapter (BibliotecaSuperAnaliseXML bibliotecaXml) {
	    this.bibliotecaXml = bibliotecaXml; 
	}
	
	
	@Override
	public void analisadorDeDadosJson(String dadosJson) {
	
		String dadosConvertidosParaXml = converterJsonParaXml(dadosJson);
		
		bibliotecaXml.executarAnaliseAvancada(dadosConvertidosParaXml);
	}

	private String converterJsonParaXml(String dadosJson) {
		
		return "<cliente><nome>Carlos</nome><status>Ativo</status></cliente>";
	}

}
