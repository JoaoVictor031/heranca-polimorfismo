package org.example.exercicio1;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Caramelo", 5);
        Cavalo cavalo = new Cavalo("Apolo", 8);
        Preguica preguica = new Preguica("Sid", 3);

        cachorro.emitirSom();
        cachorro.correr();

        cavalo.emitirSom();
        cavalo.correr();

        preguica.emitirSom();
        preguica.subirArvores();
    }
}
