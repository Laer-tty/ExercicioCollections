package Set.ConjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicas.remove(palavra);
    }

    public void verificaPalavra(String palavra) {
        boolean verifica = false;
        for (String palavraUnica : palavrasUnicas) {
            if (palavraUnica.equals(palavra)) {
               verifica = true;
            }
        }

        if (verifica) {
            System.out.println("A palavra " + palavra + " está contida no conjunto");
        } else {
            System.out.println("A palavra " + palavra + " não está contida no conjunto");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicas);
    }

    @Override
    public String toString() {
        return palavrasUnicas.toString();
    }
}
