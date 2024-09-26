package Set.AgendaDeContatos;

public class teste {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", "123456789");
        agendaContatos.adicionarContato("Maria", "987654321");
        agendaContatos.adicionarContato("Maria Fernandes", "55555555");
        agendaContatos.adicionarContato("Ana", "88889999");
        agendaContatos.adicionarContato("Fernando", "77778888");
        agendaContatos.adicionarContato("Carolina", "55555555");

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        agendaContatos.atualizaNumeroContato("Maria","123");

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));
    }
}
