package org.example.exercicio4;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está fazendo um som lento.");
    }

    public void subirArvores() {
        System.out.println("A preguiça está subindo em árvores.");
    }
}
