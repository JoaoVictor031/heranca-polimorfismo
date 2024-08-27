package org.example.exercicio4;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro começou a latir.");
    }

    public void correr() {
        System.out.println("O cachorro está correndo.");
    }
}
