package Map.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!contatosMap.isEmpty()) {
            contatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(contatosMap);
    }

    public Integer pesquisaPorNome(String nome) {
        Integer numeroContato = null;
        if (!contatosMap.isEmpty()) {
            numeroContato = contatosMap.get(nome);
        }
        return numeroContato;
    }
}
