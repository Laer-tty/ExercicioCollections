package Lista.CatalogoDeLivros;

public class teste {

    public static void main(String[] args) {

        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogo.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogo.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2019,2022));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));
    }

}
