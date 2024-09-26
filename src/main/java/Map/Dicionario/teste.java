package Map.Dicionario;

public class teste {

    public static void main(String[] args) {
        Dicionario d = new Dicionario();

        d.adicionarPalavra("Palavra 1","Definição 1");
        d.adicionarPalavra("Palavra 2","Definição 2");
        d.adicionarPalavra("Palavra 1","Definição 3");
        d.adicionarPalavra("Palavra 3","Definição 2");

        d.exibirPalavras();

        d.removerPalavra("Palavra 3");
        d.exibirPalavras();

        System.out.println(d.pesquisarPorPalavra("Palavra 1"));
    }
}
