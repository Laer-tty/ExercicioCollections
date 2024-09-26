package Set.ConjuntoDePalavrasUnicas;

public class teste {

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Banana");
        palavras.adicionarPalavra("Maçã");
        palavras.adicionarPalavra("Pera");
        palavras.adicionarPalavra("Uva");

        palavras.verificaPalavra("Maçã");
        palavras.removerPalavra("Maçã");
        palavras.verificaPalavra("Maçã");

        palavras.exibirPalavrasUnicas();
    }
}
