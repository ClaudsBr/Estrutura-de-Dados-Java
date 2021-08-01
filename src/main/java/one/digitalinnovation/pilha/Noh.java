package one.digitalinnovation.pilha;

public class Noh {
    private int dado;
    private Noh refNoh = null;

    public Noh(int dado) {
        this.dado = dado;
    }

    public Noh() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Noh getRefNoh() {
        return refNoh;
    }

    public void setRefNoh(Noh refNoh) {
        this.refNoh = refNoh;
    }

    @Override
    public String toString() {
        return "Noh{" +
                "dado=" + dado +
                '}';
    }
}
