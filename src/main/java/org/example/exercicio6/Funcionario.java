package org.example.exercicio6;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    protected double rendaBasica = 1000.00;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double calcularRendaTotal() {
        return rendaBasica;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código Funcional: " + codigoFuncional);
        System.out.println("Renda Total: R$ " + calcularRendaTotal());
    }
}
