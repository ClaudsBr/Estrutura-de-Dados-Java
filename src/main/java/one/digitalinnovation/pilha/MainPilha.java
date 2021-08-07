package one.digitalinnovation.pilha;

import one.digitalinnovation.noh.Noh;

public class MainPilha {
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();

        //adicionando nós na pilha com o método empilhar()
        minhaPilha.empilhar(new Noh(1));
        minhaPilha.empilhar(new Noh(2));
        minhaPilha.empilhar(new Noh(3));
        minhaPilha.empilhar(new Noh(4));
        minhaPilha.empilhar(new Noh(5));
        minhaPilha.empilhar(new Noh(6));

        System.out.println(minhaPilha);

        //Utilizando o metodo desempilhar()
        minhaPilha.desempilhar();
        System.out.println(minhaPilha);

        //Utilizando o método estaVazia()
        System.out.println("A pilha está vazia?");
        System.out.println(minhaPilha.estaVazia());

        //Utilizando o método toString

        System.out.println(minhaPilha.toString());

    }
}
