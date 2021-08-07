package one.digitalinnovation.listaencadeada;

import one.digitalinnovation.noh.Noh;

public class ListaEncadeada<T> {

    Noh<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public int tamanho(){
        int tamanhoLista = 0;

        Noh<T> refAuxiliar = refEntrada;
        while(true){
            if(refAuxiliar != null){
                tamanhoLista++;
                if(refAuxiliar.getProximo()!= null){
                    refAuxiliar = refAuxiliar.getProximo();
                }else {
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean estaVazia(){
        return refEntrada == null ? true: false;
    }

    public void adicionarNoh(T conteudo){
        Noh<T> novoNoh = new Noh<>(conteudo);

        if(this.estaVazia()){
              refEntrada = novoNoh;
              return;
        }

        Noh<T> nohAuxiliar = refEntrada;
        for(int i =0; i < this.tamanho()-1;i++ ){
            nohAuxiliar = nohAuxiliar.getProximo();
        }
        nohAuxiliar.setProximo(novoNoh);
    }

    private Noh<T> getNoh(int index){

        validaIndice(index);

        Noh<T> nohAuxiliar = refEntrada;
        Noh<T> nohRetorno = null;

        for(int i = 0; i<= index;i++){
            nohRetorno = nohAuxiliar;
            nohAuxiliar = nohAuxiliar.getProximo();
        }
        return nohRetorno;
    }

    private void validaIndice(int index){
        if(index >= tamanho()){
            throw new IndexOutOfBoundsException("Não existe conteudo no índice passado");
        }
    }

    public T get(int index){
        return getNoh(index).getConteudo();
    }

    public T remover(int index){
        Noh<T> nohPivo = this.getNoh(index);
        if(index == 0){
            refEntrada = nohPivo.getProximo();
            return nohPivo.getConteudo();
        }

        Noh<T> nohAnterior = getNoh(index -1);
        nohAnterior.setProximo(nohPivo.getProximo());
        return nohPivo.getConteudo();
    }

    @Override
    public String toString() {
        String retorno = "";
        Noh<T> nohAuxiliar = refEntrada;
        for(int i = 0; i < this.tamanho();i++){
            retorno += "Noh{conteúdo = " + nohAuxiliar.getConteudo() + "} --> ";
            nohAuxiliar = nohAuxiliar.getProximo();
        }
        retorno += null;
        return retorno;
    }

}
