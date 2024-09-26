package Set.GerenciadorDeAlunos;

public class teste {
    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno(123457L, "Maria", 9.0);
        gerenciadorAlunos.adicionarAluno(123456L, "João", 7.5);
        gerenciadorAlunos.adicionarAluno(123458L, "Fernanda", 5.0);
        gerenciadorAlunos.adicionarAluno(1234569l, "Julio", 6.8);

        System.out.println("Alunos no gerenciador:");
        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
