package org.example.exercicio4;

public class Zoologico {

    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice fora do alcance.");
        }
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();

                if (animal instanceof Cachorro) {
                    ((Cachorro) animal).correr();
                } else if (animal instanceof Cavalo) {
                    ((Cavalo) animal).correr();
                }
            }
        }
    }
}
