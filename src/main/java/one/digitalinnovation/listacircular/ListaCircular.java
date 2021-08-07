package one.digitalinnovation.listacircular;

public class ListaCircular<T> {
    private Noh<T> cabeca;
    private Noh<T> cauda;
    private int tamanhoLista;

    public int tamanho(){
        return this.tamanhoLista;
    }

    public boolean estaVazia(){

        return this.tamanhoLista == 0 ? true : false;
    }



}
