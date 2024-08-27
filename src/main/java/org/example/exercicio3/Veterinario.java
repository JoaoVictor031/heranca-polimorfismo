package org.example.exercicio3;

public class Veterinario {
    public void examinar(Animal animal) {
        System.out.print("O veterinário vai examinar o animal: ");
        animal.emitirSom();
    }
}