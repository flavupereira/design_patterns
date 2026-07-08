package padreosestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Combo implements ComponenteMenu {
     private String nomeCombo;
     private double desconto;
     private List<ComponenteMenu> itens = new ArrayList<>();
	
     
     
     
	public Combo(String nomeCombo, double desconto) {
		this.nomeCombo = nomeCombo;
		this.desconto = desconto;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nomeCombo;
	}

	@Override
	public double getPreco() {
		double precoTotal =0;
		for(ComponenteMenu item : itens) {
			precoTotal += item.getPreco();
		}
		
		return precoTotal * (1 - desconto);
	}
	
	public void adicionar(ComponenteMenu item) {
		itens.add(item);
		
	}
	
	public void remover (ComponenteMenu item) {
		itens.remove(item);
	}

}
