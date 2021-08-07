package one.digitalinnovation.listaduplamenteencadeada;

public class MainListaDuplamenteEncadeada {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        //Adicionando elemento na Lista
        minhaLista.adicionar("teste 1");
        minhaLista.adicionar("teste 2");
        minhaLista.adicionar("teste 3");
        minhaLista.adicionar("teste 4");
        minhaLista.adicionar("teste 5");
        minhaLista.adicionar("teste 6");
        minhaLista.adicionar("teste 7");

        System.out.println(minhaLista);

        //Removendo o elemento de índice 3
        minhaLista.remover(3);
        System.out.println(minhaLista);

        //Adicionando o elemento "novo teste" no índice 3
        minhaLista.adicionarNaPosicao(3,"Novo teste");
        System.out.println(minhaLista);

        //Retornando o elemento de índice 3
        System.out.println(minhaLista.get(3));

        //Retornando o tamanho da Lista
        System.out.println(minhaLista.tamanho());


    }
}
