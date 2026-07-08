package padroescriacionais.singleton;

public class Main {

	public static void main(String[] args) {
		
		Configuracoes c =  Configuracoes.getInstance();
		Configuracoes c1 =  Configuracoes.getInstance();
		
		
		if(c == c1) {
			System.out.println("São iguais");
			
		}else {
			System.out.println("São diferentes");
		}

	}

}
