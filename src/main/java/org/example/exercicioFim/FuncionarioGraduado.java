package org.example.exercicioFim;

public class FuncionarioGraduado extends Funcionario {
    private String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String universidade) {
        super(nome, codigoFuncional);
        this.universidade = universidade;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 2.00;
    }

    public String getUniversidade() {
        return universidade;
    }
}