package one.digitalinnovation.fila;

import one.digitalinnovation.noh.Noh;

public class Fila<T> {

    private Noh<T> refNoEntradaFila = null;

    public void enfileirar(T object){
        Noh novoNoh = new Noh(object);
        novoNoh.setProximo(refNoEntradaFila);
        refNoEntradaFila = novoNoh;
    }

    public T desenfileirar(){
        if(!estaVazia()){
            Noh primeiroNoh = refNoEntradaFila;
            Noh noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNoh.getProximo() != null) {
                    noAuxiliar = primeiroNoh;
                    primeiroNoh = primeiroNoh.getProximo();
                }else{
                    noAuxiliar.setProximo(null);
                    break;
                }
            }
            return (T) primeiroNoh.getConteudo();
        }
        return null;
    }

    public T primeiroDaFila(){
        if(!estaVazia()){
            Noh primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getProximo() != null) {
                    primeiroNo = primeiroNo.getProximo();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getConteudo();
        }
        return null;
    }

    public boolean estaVazia(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        Noh noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto="+ noAuxiliar.getConteudo() +"}]--->";
                if(noAuxiliar.getProximo() != null){
                    noAuxiliar = noAuxiliar.getProximo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}