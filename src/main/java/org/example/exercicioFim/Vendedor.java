package org.example.exercicioFim;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, int codigoFuncional) {
        super(nome, codigoFuncional);
        this.comissao = 250.00;
    }

    @Override
    public String toString() {
        return "Vendedor - " + super.toString();
    }
}