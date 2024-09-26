package Set.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa tarefa : tarefaSet) {
                if (tarefa.getDescricao().equals(descricao)) {
                    tarefaParaRemover = tarefa;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto de tarefas está vazio.");
        }

        if(tarefaParaRemover == null) {
            System.out.println("Nenhuma tarefa encontrada.");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("O conjunto de tarefas está vazio.");
        }
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (!tarefa.isConcluida()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }
}
