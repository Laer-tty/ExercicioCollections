package Lista.OrdenacaoDeNumeros;

public class teste {
    public static void main(String[] args) {
        OrdenacaoNumeros numero = new OrdenacaoNumeros();

        numero.adicionarNumero(5);
        numero.adicionarNumero(7);
        numero.adicionarNumero(10);
        numero.adicionarNumero(3);
        numero.adicionarNumero(2);

        System.out.println(numero.ordenarAscendente());
        System.out.println(numero.ordenarDescendente());
    }
}
