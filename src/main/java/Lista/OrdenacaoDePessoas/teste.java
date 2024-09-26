package Lista.OrdenacaoDePessoas;

public class teste {
    public static void main(String[] args) {
        OrdenacaoPessoa ordem = new OrdenacaoPessoa();

        ordem.adicionarPessoa("Nome 1", 20, 1.56);
        ordem.adicionarPessoa("Nome 2", 30, 1.80);
        ordem.adicionarPessoa("Nome 3", 25, 1.70);
        ordem.adicionarPessoa("Nome 4", 17, 1.56);
        ordem.adicionarPessoa("Nome 5", 21, 1.50);

        System.out.println(ordem.ordenarPorAltura());
        System.out.println(ordem.ordenarPorIdade());
    }
}
