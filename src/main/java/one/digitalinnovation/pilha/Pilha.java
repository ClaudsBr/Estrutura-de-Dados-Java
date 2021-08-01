package one.digitalinnovation.pilha;

public class Pilha {
    private Noh refNohEntrada;

    public Pilha() {
        this.refNohEntrada = null;
    }

    public boolean estaVazia(){
        if(refNohEntrada == null){
            return true;
        }else {
            return false;
        }
    }

    public Noh topo(){
        return refNohEntrada;
    }

    public void empilhar(Noh novoNoh){
        Noh refAuxiliar = refNohEntrada;
        refNohEntrada = novoNoh;
        refNohEntrada.setRefNoh(refAuxiliar);
    }

    public Noh desempilhar() {
        if (!this.estaVazia()) {
            Noh nohExcluido = refNohEntrada;
            refNohEntrada = refNohEntrada.getRefNoh();
            return nohExcluido;
        } else {
            return null;
        }
    }

        @Override
        public String toString(){
            String stringRetorno = "------------------\n";
            stringRetorno += "      Pilha      \n";
            stringRetorno += "------------------\n";

            Noh nohAuxiliar = refNohEntrada;

            while(true){
                if(nohAuxiliar != null){
                    stringRetorno += "[Nó{dado = "+ nohAuxiliar.getDado() + "}]\n";
                    nohAuxiliar = nohAuxiliar.getRefNoh();
                }else{
                    break;
                }
            }
            stringRetorno += "------------------";
            return stringRetorno;
        }

}
