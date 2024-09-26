package Map.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavrasContagemMap;

    public ContagemPalavras() {
        this.palavrasContagemMap = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem) {
        palavrasContagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        palavrasContagemMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(palavrasContagemMap);
    }

    public String encontrarPalavrasMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : palavrasContagemMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }
}
