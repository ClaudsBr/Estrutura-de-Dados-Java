package one.digitalinnovation.listacircular;

import one.digitalinnovation.noh.Noh;

public class ListaCircular<T> {
    private Noh<T> cabeca;
    private Noh<T> cauda;
    private int tamanhoLista;

    private Noh<T> getNoh(int index){
        if(this.estaVazia()){
            throw new IndexOutOfBoundsException("A lista está VAZIA");
        }

        if(index == 0){
            return this.cauda;
        }

        Noh<T> nohAuxiliar = this.cauda;
        for(int i=0;(i < index)&& (nohAuxiliar != null);i++){
            nohAuxiliar = nohAuxiliar.getProximo();
        }
        return nohAuxiliar;
    }

    public T get(int index){
        return this.getNoh(index).getConteudo();
    }

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public int tamanho(){
        return this.tamanhoLista;
    }

    public boolean estaVazia(){

        return this.tamanhoLista == 0 ? true : false;
    }

    public void remover(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("Este índice é maior que o tamanho da Lista");

        Noh<T> nohAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = this.cauda.getProximo();
            this.cabeca.setProximo(this.cauda);
        }else if(index ==1){
            this.cauda.setProximo(this.cauda.getProximo().getProximo());
        }else{
            for(int i =0; i < index-1;i++){
                nohAuxiliar = nohAuxiliar.getProximo();
            }
            nohAuxiliar.setProximo(nohAuxiliar.getProximo().getProximo());
        }
        this.tamanhoLista--;
    }

    public void adicionar(T conteudo){
        Noh<T> novoNoh = new Noh<>(conteudo);
        if(this.tamanhoLista == 0){
            this.cabeca = novoNoh;
            this.cauda = this.cabeca;
            this.cabeca.setProximo(cauda);
        }else{
            novoNoh.setProximo(this.cauda);
            this.cabeca.setProximo(novoNoh);
            this.cauda = novoNoh;
        }
        tamanhoLista++;
    }

    @Override
    public String toString() {
        String retorno = "";

        Noh<T> nohAuxiliar = this.cauda;
        for(int i =0; i < tamanho();i++){
            retorno += "[Nó {conteúdo ="+nohAuxiliar.getConteudo()+"}] -->";
            nohAuxiliar = nohAuxiliar.getProximo();
        }
        retorno += this.tamanho() != 0 ? "{retorna ao incio}" : "[]";


        return retorno;
    }
}
