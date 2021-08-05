package one.digitalinnovation.listaencadeada;

public class Noh<T> {
    private T conteudo;
    private Noh proximoNoh;

    public Noh() {
        this.proximoNoh = null;
    }

    public Noh(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNoh = null;
    }

    public Noh(T conteudo, Noh proximoNoh) {
        this.conteudo = conteudo;
        this.proximoNoh = proximoNoh;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Noh getProximoNoh() {
        return proximoNoh;
    }

    public void setProximoNoh(Noh proximoNoh) {
        this.proximoNoh = proximoNoh;
    }

    @Override
    public String toString() {
        return "Noh{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado(){
        String str = "Noh{"+ "conteudo = "+ conteudo + "}";

        if(proximoNoh != null){
            str += "->"+ proximoNoh.toString();
        }else{
            str += "-> null";
        }
        return str;
    }
}
