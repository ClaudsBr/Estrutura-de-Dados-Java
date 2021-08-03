package one.digitalinnovation.fila;

public class MainFila {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        System.out.println("A fila está vazia? \n"+minhaFila.estaVazia());
        //enfileirando objetos
        minhaFila.enfileirar("first");
        minhaFila.enfileirar("second");
        minhaFila.enfileirar("third");
        minhaFila.enfileirar("forth");
        minhaFila.enfileirar("fifth");
        minhaFila.enfileirar("last");
        System.out.println(minhaFila);


        System.out.println("Primeiro da fila? \n"+minhaFila.primeiroDaFila());
        System.out.println("Desenfileirando... \nQuem sai: "+minhaFila.desenfileirar());
        System.out.println(minhaFila);
        System.out.println("Novo primeiro da fila: "+minhaFila.primeiroDaFila());
        System.out.println("A fila está vazia? "+minhaFila.estaVazia());




    }
}
