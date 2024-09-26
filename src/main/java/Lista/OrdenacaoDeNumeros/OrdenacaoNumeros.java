package Lista.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdenadosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosOrdenadosAscendente);
        return numerosOrdenadosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenadosDescendente = new ArrayList<>(numeros);
        Collections.sort(numerosOrdenadosDescendente, Collections.reverseOrder());
        return numerosOrdenadosDescendente;
    }
}
