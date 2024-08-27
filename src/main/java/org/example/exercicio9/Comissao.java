package org.example.exercicio9;

public abstract class Comissao {
    protected double salarioBase;

    public Comissao(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularComissao();

    public double calcularSalario() {
        return salarioBase + calcularComissao();
    }
}

