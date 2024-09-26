package Set.GerenciadorDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> setAlunos;

    public GerenciadorAlunos() {
        this.setAlunos = new HashSet<>();
    }

    public void adicionarAluno(long matricula, String nome, double nota) {
        setAlunos.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno(long matricula) {
        Set<Aluno> alunoAremover = new HashSet<>();
        for (Aluno aluno : setAlunos) {
            if (aluno.getMatricula() == matricula) {
                alunoAremover.add(aluno);
                break;
            }
        }
        if (alunoAremover.isEmpty()) {
            System.out.println("O aluno não está presente.");
        } else {
            setAlunos.removeAll(alunoAremover);
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparadorPorNota());
        alunosPorNota.addAll(setAlunos);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(setAlunos);
    }
}
