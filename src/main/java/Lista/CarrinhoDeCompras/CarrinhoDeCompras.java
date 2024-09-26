package Lista.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemARemover = new ArrayList<>();
        for (Item item : listaItens) {
            if (item.getNome().equals(nome)) {
                itemARemover.add(item);
            }
        }
        listaItens.removeAll(itemARemover);

    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : listaItens) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(listaItens);
    }

}
