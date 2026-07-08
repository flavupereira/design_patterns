package padreosestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArvores {
	
	private static Map<String , TipoArvore> tipos = new HashMap<>();
	
	public static TipoArvore getTipoArvore(String nome , String cor , String texturaTronco) {
		String chave = nome +" - " + cor;
		
		if(!tipos.containsKey(chave)) {
			tipos.put(chave, new TipoArvore(nome, cor, texturaTronco));
			System.out.println("===> Criando novo tipo de arvore " + nome);
		}
		
		
		return tipos.get(chave);
		
	}
	
	

}
