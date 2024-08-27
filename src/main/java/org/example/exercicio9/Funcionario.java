package org.example.exercicio9;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    protected double rendaBasica = 1000.00;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public double calcularRendaTotal() {
        double rendaComComissao = rendaBasica;
        if (comissao != null) {
            rendaComComissao += comissao.calcularComissao();
        }
        return rendaComComissao;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.println("Renda Total: R$ " + calcularRendaTotal());
    }
}
