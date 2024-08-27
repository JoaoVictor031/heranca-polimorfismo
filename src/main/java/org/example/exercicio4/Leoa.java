package org.example.exercicio4;

public class Leoa extends Animal {

    public Leoa(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A leoa começou a rugir.");
    }

    public void correr() {
        System.out.println("A leoa está correndo.");
    }
}