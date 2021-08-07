package one.digitalinnovation.listaduplamenteencadeada;

public class MainListaDuplamenteEncadeada {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        minhaLista.adicionar("teste 1");
        minhaLista.adicionar("teste 2");
        minhaLista.adicionar("teste 3");
        minhaLista.adicionar("teste 4");
        minhaLista.adicionar("teste 5");
        minhaLista.adicionar("teste 6");
        minhaLista.adicionar("teste 7");

        System.out.println(minhaLista);

        minhaLista.remover(3);
        System.out.println(minhaLista);

        minhaLista.adicionarNaPosicao(3,"Novo teste");

        System.out.println(minhaLista);

        System.out.println(minhaLista.get(3));

        System.out.println(minhaLista.tamanho());


    }
}
