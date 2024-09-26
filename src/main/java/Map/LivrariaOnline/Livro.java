package Map.LivrariaOnline;

import java.util.*;

public class Livro {

    private String titulo;

    private String autor;

    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Titulo do Livro: " + titulo + " Nome do Autor: " + autor + " Preço: " + preco + "\n";
    }

    static class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
        @Override
        public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
            return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
        }
    }

}
