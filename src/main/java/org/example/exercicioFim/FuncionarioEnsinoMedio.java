package org.example.exercicioFim;

public class FuncionarioEnsinoMedio extends Funcionario {
    private String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaMedio) {
        super(nome, codigoFuncional);
        this.escolaMedio = escolaMedio;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.50;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }
}
