package padroescriacionais.prototype;

public class Main {
	
	
	public static void main(String[] args) {
		
		Retangulo retanguloOriginal  = new Retangulo();
		retanguloOriginal.id = "RET001";
		
		Retangulo retanguloClone = (Retangulo) retanguloOriginal.clone();
		retanguloClone.id = "RET002";
		
		System.out.println(retanguloOriginal == retanguloClone);
		System.out.println(retanguloOriginal.tipo);
		System.out.println(retanguloClone.tipo);
		
		
		System.out.println("ID Original: " + retanguloOriginal.id); // RET001
        System.out.println("ID Clone:    " + retanguloClone.id);    // RET002
		
		retanguloOriginal.desenhar();
		retanguloClone.desenhar();
		
		
	}

}
