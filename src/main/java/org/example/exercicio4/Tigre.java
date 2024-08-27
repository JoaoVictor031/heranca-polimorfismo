package org.example.exercicio4;

public class Tigre extends Animal {

    public Tigre(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O tigre começou a rugir.");
    }

    public void correr() {
        System.out.println("O tigre está correndo.");
    }
}