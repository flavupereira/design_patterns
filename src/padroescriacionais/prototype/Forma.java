package padroescriacionais.prototype;

public abstract class Forma implements  Cloneable {
	
	public String id;
	public String tipo;
	
	
	abstract void desenhar();

	
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	   
}
