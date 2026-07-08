package padreosestruturais.adapter;

public class AnalisadorInterno implements AnalisadorDados {

	@Override
	public void analisadorDeDadosJson(String dadosJson) {
		System.out.println("Preparando Json Internamente" + dadosJson);
	}

}
