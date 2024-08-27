package org.example.exercicio2;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro("Caramelo", 5);
        animais[1] = new Cavalo("Apolo", 8);
        animais[2] = new Preguica("Sid", 3);

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
