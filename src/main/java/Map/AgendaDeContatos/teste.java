package Map.AgendaDeContatos;

public class teste {

    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Pedro", 123456);
        agenda.adicionarContato("Pedro Henrique", 1234556);
        agenda.adicionarContato("Pedro Julius", 12345436);
        agenda.adicionarContato("Pedro Gabriel", 12346);

        agenda.exibirContatos();
        agenda.removerContato("Pedro Henrique");
        System.out.printf("Telefone: " + agenda.pesquisaPorNome("Pedro"));
    }
}
