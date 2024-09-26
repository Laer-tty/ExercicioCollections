package Set.GerenciadorDeAlunos;

import java.util.Comparator;

public class Aluno  implements Comparable<Aluno> {

    private long matricula;

    private String nome;

    private double nota;

    public Aluno(long matricula, String nome, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome do aluno: " + nome + " Matricula: " + matricula + " Nota: " + nota + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(matricula);
    }

    @Override
    public int compareTo(Aluno p) {
        return nome.compareTo(p.getNome());
    }
}

class ComparadorPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno p1, Aluno p2) {
        return Double.compare(p1.getNota(), p2.getNota());
    }
}