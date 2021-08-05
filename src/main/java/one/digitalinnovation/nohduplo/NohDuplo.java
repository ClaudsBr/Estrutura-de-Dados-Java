package one.digitalinnovation.nohduplo;

public class NohDuplo<T> {
    private T conteudo;
    private NohDuplo<T> nohAnterior;
    private NohDuplo<T> proximoNoh;

    public NohDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NohDuplo<T> getNohAnterior() {
        return nohAnterior;
    }

    public void setNohAnterior(NohDuplo<T> nohAnterior) {
        this.nohAnterior = nohAnterior;
    }

    public NohDuplo<T> getProximoNoh() {
        return proximoNoh;
    }

    public void setProximoNoh(NohDuplo<T> proximoNoh) {
        this.proximoNoh = proximoNoh;
    }

    @Override
    public String toString() {
        return "NohDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
