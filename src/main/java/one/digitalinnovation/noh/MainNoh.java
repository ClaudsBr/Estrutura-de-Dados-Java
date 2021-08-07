package one.digitalinnovation.noh;

public class MainNoh {
    public static void main(String[] args) {
        Noh<String> noh1 = new Noh<>("Conteúdo nó1");
        Noh<String> noh2 = new Noh<>("Conteudo nó2");

        noh1.setProximo(noh2);

        Noh<String> noh3 = new Noh<>("Conteúdo nó3");
        noh2.setProximo(noh3);

        Noh<String> noh4 = new Noh<>("Conteúdo nó4");
        noh3.setProximo(noh4);

        Noh<Integer> noh5 = new Noh<>(1);
        noh4.setProximo(noh5);

        // noh1 -> noh2 -> noh3 -> noh4 -> null

        System.out.println(noh1);
        System.out.println(noh5.getProximo());
        System.out.println(noh1.getProximo());
        System.out.println(noh4.getProximo());
        System.out.println(noh1.getProximo().getProximo());
    }
}
