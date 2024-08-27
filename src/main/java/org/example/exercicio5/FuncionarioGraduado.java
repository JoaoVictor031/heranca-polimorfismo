package org.example.exercicio5;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduado(String nome, int codigoFuncional, String escolaBasica, String escolaMedia, String universidade) {
        super(nome, codigoFuncional, escolaBasica, escolaMedia);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Universidade: " + universidade);
    }
}
