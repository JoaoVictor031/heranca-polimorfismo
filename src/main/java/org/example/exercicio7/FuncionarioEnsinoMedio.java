package org.example.exercicio7;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedia;

    public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String escolaBasica, String escolaMedia) {
        super(nome, codigoFuncional, escolaBasica);
        this.escolaMedia = escolaMedia;
    }

    public String getEscolaMedia() {
        return escolaMedia;
    }

    public void setEscolaMedia(String escolaMedia) {
        this.escolaMedia = escolaMedia;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.50; //50%
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Escola Média: " + escolaMedia);
    }
}
