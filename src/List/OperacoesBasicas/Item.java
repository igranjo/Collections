package List.OperacoesBasicas;

public class Item {

    private String nome;
    private double preço;
    private int quantidade;

    public Item( String nome, double preço, int quantidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    


    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Item{"
                    + "Nome = " + nome
                    + "\n" + "Preço = " + preço
                    + "\n" + "Quantidade = " + quantidade +"}";
    
    }
}
