package padroescriacionais.buider;

public class Carro {

	private final String motor;
	private final int portas;
	private final boolean possuiArCondicionado;
	
	private Carro (carroBuilder builder) {
		this.motor = builder.motor;
		this.portas = builder.portas;
		this.possuiArCondicionado = builder.possuiArCondicionado;
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "Carro [motor=" + motor + ", portas=" + portas + ", possuiArCondicionado=" + possuiArCondicionado + "]";
	}


	public static class carroBuilder {
		
		private  String motor;
		private  int portas = 4;
		private  boolean possuiArCondicionado = false;
		
		
		public carroBuilder motor(String motor) {
			this.motor = motor;
			return this;
		}
		
		
		public carroBuilder portas(int portas) {
			this.portas = portas;
			return this;
		}
		
		
		public carroBuilder possuiArCondicionado(boolean possuiArCondicionado) {
			this.possuiArCondicionado = possuiArCondicionado;
			return this;
		}
		
		
		
		public Carro buid() {
			return new Carro(this);
		}
		
	}
}
