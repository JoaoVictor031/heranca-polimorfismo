package org.example.exercicio3;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Caramelo", 5);
        Cavalo cavalo = new Cavalo("Apolo", 8);
        Preguica preguica = new Preguica("Sid", 3);

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}