package Lista.ListaDeTarefas;

public class teste {

    public static void main(String[] args) {

        ListaTarefas lista = new ListaTarefas();

        System.out.println("O número total de tarefas é: " + lista.obterNumeroTotalTarefas());

        lista.adicionarTarefa("Programar");
        lista.adicionarTarefa("Jogar");
        lista.adicionarTarefa("Jogar");
        lista.adicionarTarefa("Dormir");

        lista.removerTarefa("Programar1");

        System.out.println("O número total de tarefas é: " + lista.obterNumeroTotalTarefas());

        lista.obterDescricoesTarefas();
    }
}
