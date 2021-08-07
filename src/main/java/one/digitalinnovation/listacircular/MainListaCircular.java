package one.digitalinnovation.listacircular;

public class MainListaCircular {

    public static void main(String[] args) {
        ListaCircular<String> minhaLista = new ListaCircular<>();


        //Adicionando o primeiro objeto na Lista
        minhaLista.adicionar("Objeto1");
        System.out.println(minhaLista);

        //Removendo o objeto e imprimindo uma Lista vazia
        minhaLista.remover(0);
        System.out.println(minhaLista);


        //Adicionando Objetos a Lista
        minhaLista.adicionar("Objeto1");
        minhaLista.adicionar("Objeto2");
        minhaLista.adicionar("Objeto3");
        minhaLista.adicionar("Objeto4");
        minhaLista.adicionar("Objeto5");
        System.out.println(minhaLista);

        //Retornando o tamanho da Lista Circular
        System.out.println(minhaLista.tamanho());

        //Removendo o objeto de índice 2 na Lista
        minhaLista.remover(2);
        System.out.println(minhaLista);

        //Adicionando um novo objeto na Lista Circular
        minhaLista.adicionar("Novo Objeto");

        System.out.println(minhaLista);

        //Looping
        for(int i=0; i < 20;i++){
            System.out.println(minhaLista.get(i));
        }
    }
}
