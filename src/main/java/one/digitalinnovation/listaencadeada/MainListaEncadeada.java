package one.digitalinnovation.listaencadeada;

public class MainListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada<String> minhaLista = new ListaEncadeada<>();

        //Adicionando elementos na Lista
        minhaLista.adicionarNoh("teste 1");
        minhaLista.adicionarNoh("teste 2");
        minhaLista.adicionarNoh("teste 3");
        minhaLista.adicionarNoh("teste 4");
        minhaLista.adicionarNoh("teste 5");

        // Usando um for para varrer a Lista
        for(int i = 0; i < minhaLista.tamanho();i++){
            System.out.println(minhaLista.get(i));
        }

        System.out.println(minhaLista.toString());

        //Removendo elemento de índice 3
        System.out.println(minhaLista.remover(3));
        System.out.println(minhaLista);
    }
}
