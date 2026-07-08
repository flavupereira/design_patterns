package padreosestruturais.decorator;

public class Main {
    public static void main(String[] args) {
      
        Cafe meuCafe = new CafeSimples();
        System.out.println(meuCafe.getDescricao() + " -> R$ " + meuCafe.getPreco());
        
       
        meuCafe = new Leite(meuCafe);
        System.out.println(meuCafe.getDescricao() + " -> R$ " + meuCafe.getPreco());
        
      
        meuCafe = new Chocolate(meuCafe);
        System.out.println(meuCafe.getDescricao() + " -> R$ " + meuCafe.getPreco());
        
       
        Cafe cafeSuperChocolate = new Chocolate(new Chocolate(new CafeSimples()));
        System.out.println(cafeSuperChocolate.getDescricao() + " -> R$ " + cafeSuperChocolate.getPreco());
    }
}