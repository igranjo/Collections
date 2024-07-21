package List.OperacoesBasicas;
import java.util.List;
import java.util.ArrayList;


public class CarrinhoDeCompras {
    private List<Item> itemList;
    
    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preço, int quantidade){
        Item item = new Item(nome, preço, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!this.itemList.isEmpty()){
            for (Item i : this.itemList){
                if (i.getNome().equals(nome)){
                    itensParaRemover.add(i);
                }
            }
        }
        else{
            System.out.println("A lista de itens está vazia!");
        }

        this.itemList.removeAll(itensParaRemover);
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!this.itemList.isEmpty()){
            for (Item i : this.itemList){
                 valorTotal += i.getPreço()*i.getQuantidade();
            }
        }
        else{
            System.out.println("A lista está vazia!");
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(toString());
        
    }

    @Override
    public String toString() {
        return "Lista dos itens:" + itemList;
    }
}
