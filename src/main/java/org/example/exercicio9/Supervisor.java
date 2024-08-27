package org.example.exercicio9;

public class Supervisor extends Comissao {
    private static final double ADICIONAL = 600.00;

    public Supervisor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularComissao() {
        return ADICIONAL;
    }
}

