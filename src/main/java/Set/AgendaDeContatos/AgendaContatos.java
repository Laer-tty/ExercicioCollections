package Set.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatos) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public void atualizaNumeroContato(String nome, String novoTelefone) {
        for (Contato c : contatos) {
            if (c.getNome().equals(nome)) {
                c.setTelefone(novoTelefone);
                break;
            }
        }
    }

}
