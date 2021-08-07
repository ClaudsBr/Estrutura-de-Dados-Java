package one.digitalinnovation.listaduplamenteencadeada;

import one.digitalinnovation.nohduplo.NohDuplo;

public class ListaDuplamenteEncadeada<T> {

    private NohDuplo<T> primeiroNoh;
    private NohDuplo<T> ultimoNoh;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        primeiroNoh = null;
        ultimoNoh = null;
        this.tamanhoLista = 0;
    }

    public int tamanho(){
        return this.tamanhoLista;
    }

    private NohDuplo<T> getNoh(int index){
        NohDuplo<T> nohAuxiliar = primeiroNoh;

        for (int i= 0;(i < index) && (nohAuxiliar != null) ;i++){
            nohAuxiliar = nohAuxiliar.getProximoNoh();
        }
        return nohAuxiliar;
    }

    public T get(int index){
        return this.getNoh(index).getConteudo();
    }

    public void adicionar(T elemento){
        NohDuplo<T> novoNoh = new NohDuplo<>(elemento);
        novoNoh.setProximoNoh(null);
        novoNoh.setNohAnterior(ultimoNoh);

        if(primeiroNoh == null){
            primeiroNoh = novoNoh;
        }
        if(ultimoNoh != null){
            ultimoNoh.setProximoNoh(novoNoh);
        }
        ultimoNoh = novoNoh;
        tamanhoLista++;
    }

    public void adicionarNaPosicao(int index, T elemento){
        NohDuplo<T> nohAuxiliar = getNoh(index);
        NohDuplo<T> novoNoh = new NohDuplo<>(elemento);
        novoNoh.setProximoNoh(nohAuxiliar);

        if(novoNoh.getProximoNoh() != null){
            novoNoh.setNohAnterior(nohAuxiliar.getNohAnterior());
            novoNoh.getProximoNoh().setNohAnterior(novoNoh);
        }else{
            novoNoh.setNohAnterior(ultimoNoh);
            ultimoNoh = novoNoh;
        }

        if(index == 0){
            primeiroNoh = novoNoh;
        }else{
            novoNoh.getNohAnterior().setProximoNoh(novoNoh);
        }
        tamanhoLista++;
    }

    public void remover(int index){

        if(index == 0){
            primeiroNoh = primeiroNoh.getProximoNoh();
            if (primeiroNoh != null )  {
                primeiroNoh.setNohAnterior(null);
            }
        }else{
            NohDuplo<T> nohAuxiliar = getNoh(index);
            nohAuxiliar.getNohAnterior().setProximoNoh(nohAuxiliar.getProximoNoh());

            if(nohAuxiliar != ultimoNoh){
                nohAuxiliar.getProximoNoh().setNohAnterior(nohAuxiliar.getNohAnterior());
            }else{
                ultimoNoh = nohAuxiliar;
            }
        }

        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        String retorno = "";

        NohDuplo<T> nohAuxiliar = primeiroNoh;

        for(int i =0 ; i < tamanho();i++){
            retorno += "[Nó{conteúdo "+ nohAuxiliar.getConteudo() +"}] --> ";
            nohAuxiliar = nohAuxiliar.getProximoNoh();
        }
        retorno += "null";
        return retorno;
    }
}