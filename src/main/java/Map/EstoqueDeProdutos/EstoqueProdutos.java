package Map.EstoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod,new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double total = 0;
        for (Produto produto : estoqueProdutosMap.values()) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() < menorPreco) {
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorPreco = Double.MIN_VALUE;
        double valorTotal;
        for (Produto produto : estoqueProdutosMap.values()) {
            valorTotal = produto.getPreco() * produto.getQuantidade();
            if (valorTotal > maiorPreco) {
                maiorPreco = valorTotal;
                produtoMaiorQuantidadeValorTotalNoEstoque = produto;
            }
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

}
