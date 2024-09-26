package Lista.CarrinhoDeCompras;

public class teste {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Tomate", 15, 2);
        carrinho.adicionarItem("Batata", 10, 3);
        carrinho.adicionarItem("Cenoura", 6, 5);
        carrinho.adicionarItem("Cenoura", 6, 5);

        System.out.println("O valor total é de: R$" + carrinho.calcularValorTotal() + " reais.");

        carrinho.removerItem("Cenoura");

        System.out.println("O valor total é de: R$" + carrinho.calcularValorTotal() + " reais.");
        carrinho.exibirItens();
    }

}
