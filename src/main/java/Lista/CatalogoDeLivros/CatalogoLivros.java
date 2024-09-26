package Lista.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivro;

    public CatalogoLivros() {
        this.listaLivro = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        this.listaLivro.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaLivro.isEmpty()) {
            for (Livro livro : listaLivro) {
                if (livro.getAutor().equals(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> LivrosPorAnos = new ArrayList<>();
        if (!listaLivro.isEmpty()) {
            for (Livro livro : listaLivro) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    LivrosPorAnos.add(livro);
                }
            }
        }
        return LivrosPorAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listaLivro.isEmpty()) {
            for (Livro livro : listaLivro) {
                if (livro.getTitulo().equals(titulo)) {
                   livroPorTitulo = livro;
                   break;
                }
            }
        }
        return livroPorTitulo;
    }

}
