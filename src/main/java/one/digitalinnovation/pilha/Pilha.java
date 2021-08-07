package one.digitalinnovation.pilha;

import one.digitalinnovation.noh.Noh;

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
        refNohEntrada.setProximo(refAuxiliar);
    }

    public Noh desempilhar() {
        if (!this.estaVazia()) {
            Noh nohExcluido = refNohEntrada;
            refNohEntrada = refNohEntrada.getProximo();
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
                    stringRetorno += "[Nó{dado = "+ nohAuxiliar.getConteudo() + "}]\n";
                    nohAuxiliar = nohAuxiliar.getProximo();
                }else{
                    break;
                }
            }
            stringRetorno += "------------------";
            return stringRetorno;
        }

}
