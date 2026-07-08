package padreosestruturais.composite;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

	
	public static void main(String[] args) {
		
		ComponenteMenu hamburguer = new ItemIndividual("Big Burguer", 25.00);
		ComponenteMenu batata = new ItemIndividual("Batata Frita M", 10.00);
		ComponenteMenu refrigerente = new ItemIndividual("Coca-Cola 500 ml", 8.00);
		ComponenteMenu sundae = new ItemIndividual("Sundae de Chocolate", 7.00);
		
		
		Combo comboFeliz = new Combo("Combo Feliz", 0.10);
		comboFeliz.adicionar(hamburguer);
		comboFeliz.adicionar(batata);
		comboFeliz.adicionar(refrigerente);
		
		
		Combo comboFamilia = new Combo("Combo Familia", 0.15);
		comboFamilia.adicionar(comboFeliz);
		comboFamilia.adicionar(sundae);
		
		
		System.out.println("---------------DETALAHE DOS PREÇOS------------------");
		
		System.out.printf("Item avulso %s -> R$ %.2f%n" , hamburguer.getNome() , hamburguer.getPreco()) ;
		System.out.printf("Combo simples: %s -> R$ %.2f%n" , comboFeliz.getNome() , comboFeliz.getPreco());
		System.out.printf("Combo familia: %s -> R$ %.2f%n" , comboFamilia.getNome() , comboFamilia.getPreco()) ;
 	}
 	}

