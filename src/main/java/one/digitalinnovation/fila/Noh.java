package one.digitalinnovation.fila;

public class Noh<T> {
    private T object;
    private Noh<T> refNoh;

    public Noh(T object) {
        this.object = object;
        this.refNoh = null;
    }

    public Noh() {
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
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
                "object=" + object +
                '}';
    }
}
