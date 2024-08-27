package org.example.exercicio4;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(0, new Cachorro("Caramelo", 5));
        zoologico.adicionarAnimal(1, new Cavalo("Spirit", 8));
        zoologico.adicionarAnimal(2, new Preguica("Sid", 3));
        zoologico.adicionarAnimal(3, new Preguica("Soninho", 3));
        zoologico.adicionarAnimal(4, new Tigre("Tigrinho", 7));
        zoologico.adicionarAnimal(5, new Leao("Simba", 6));
        zoologico.adicionarAnimal(6, new Leoa("nala", 2));
        zoologico.adicionarAnimal(7, new Tigre("Bengala", 20));
        zoologico.adicionarAnimal(8, new Leao("Scar ", 15));
        zoologico.adicionarAnimal(9, new Cavalo("Albino", 4));

        zoologico.percorrerJaulas();
    }
}