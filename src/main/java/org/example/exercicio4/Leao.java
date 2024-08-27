package org.example.exercicio4;

public class Leao extends Animal {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O leao começou a rugir.");
    }

    public void correr() {
        System.out.println("O leao está correndo.");
    }
}