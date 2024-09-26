package Lista.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros = new ArrayList<>();

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if (!numeros.isEmpty()) {
            for (int numero : numeros) {
                soma += numero;
            }
        }
        return soma;
    }

    public int encontraMaiorNumero() {
        int maior = -10000;
        if (!numeros.isEmpty()) {
            for (int numero : numeros) {
                if (numero > maior) {
                    maior = numero;
                }
            }
        }
        return maior;
    }

    public int encontraMenorNumero() {
        int menor = 10000;
        if (!numeros.isEmpty()) {
            for (int numero : numeros) {
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        return menor;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }
}
