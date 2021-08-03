package one.digitalinnovation.fila;

public class Fila<T> {

    private Noh<T> refNoEntradaFila = null;

    public void enfileirar(T object){
        Noh novoNoh = new Noh(object);
        novoNoh.setRefNoh(refNoEntradaFila);
        refNoEntradaFila = novoNoh;
    }

    public T desenfileirar(){
        if(!estaVazia()){
            Noh primeiroNoh = refNoEntradaFila;
            Noh noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNoh.getRefNoh() != null) {
                    noAuxiliar = primeiroNoh;
                    primeiroNoh = primeiroNoh.getRefNoh();
                }else{
                    noAuxiliar.setRefNoh(null);
                    break;
                }
            }
            return (T) primeiroNoh.getObject();
        }
        return null;
    }

    public T primeiroDaFila(){
        if(!estaVazia()){
            Noh primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNoh() != null) {
                    primeiroNo = primeiroNo.getRefNoh();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
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
                stringRetorno += "[No{objeto="+ noAuxiliar.getObject() +"}]--->";
                if(noAuxiliar.getRefNoh() != null){
                    noAuxiliar = noAuxiliar.getRefNoh();
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