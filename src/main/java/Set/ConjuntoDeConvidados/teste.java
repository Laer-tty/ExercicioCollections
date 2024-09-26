package Set.ConjuntoDeConvidados;

public class teste {
    public static void main(String[] args) {

        ConjuntoConvidados conjunto = new ConjuntoConvidados();

        System.out.println("Existem " + conjunto.contarConvidados() + " convidados.");

        conjunto.adicionarConvidado("Pessoa 1", 1333);
        conjunto.adicionarConvidado("Pessoa 2", 1334);
        conjunto.adicionarConvidado("Pessoa 3", 1334);
        conjunto.adicionarConvidado("Pessoa 4", 1336);

        conjunto.exibirConvidados();
        conjunto.removerConvidadoPorCodigoConvite(1334);

        System.out.println("Existem " + conjunto.contarConvidados() + " convidados.");
    }
}
