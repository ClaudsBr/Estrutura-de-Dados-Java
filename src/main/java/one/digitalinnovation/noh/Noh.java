package one.digitalinnovation.noh;

public class Noh<T> {

    private T conteudo;
    private Noh<T> proximo;

    public Noh(T conteudo) {
        this.proximo =null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Noh<T> getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Noh{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
