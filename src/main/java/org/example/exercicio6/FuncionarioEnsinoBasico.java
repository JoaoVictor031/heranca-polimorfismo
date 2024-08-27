package org.example.exercicio6;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasica;

    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasica) {
        super(nome, codigoFuncional);
        this.escolaBasica = escolaBasica;
    }

    public String getEscolaBasica() {
        return escolaBasica;
    }

    public void setEscolaBasica(String escolaBasica) {
        this.escolaBasica = escolaBasica;
    }

    @Override
    public double calcularRendaTotal() {
        return rendaBasica * 1.10; //10%
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Escola Básica: " + escolaBasica);
    }
}
