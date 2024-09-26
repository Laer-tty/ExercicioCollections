package Map.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        palavrasMap.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraProcurada = null;
        if (!palavrasMap.isEmpty()) {
            palavraProcurada = palavrasMap.get(palavra);
        } else {
            System.out.println("O contéudo está vazio.");
        }
        return palavraProcurada;
    }

}
