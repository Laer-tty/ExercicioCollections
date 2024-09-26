package Lista.SomaNumeros;

public class teste {

    public static void main(String[] args) {

        SomaNumeros numero = new SomaNumeros();

        numero.adicionarNumero(5);
        numero.adicionarNumero(10);
        numero.adicionarNumero(2);
        numero.adicionarNumero(3);

        System.out.println("A soma dos números é: " + numero.calcularSoma());
        System.out.println("O maior número é: " + numero.encontraMaiorNumero());
        System.out.println("O menor número é: " + numero.encontraMenorNumero());
        numero.exibirNumeros();
    }
}
