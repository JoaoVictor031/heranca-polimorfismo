package org.example.exercicio8;

public class Vendedor extends Comissao {
    private static final double ADICIONAL = 250.00;

    public Vendedor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularComissao() {
        return ADICIONAL;
    }
}
