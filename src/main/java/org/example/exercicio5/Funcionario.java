package org.example.exercicio5;

public class Funcionario {
    private String nome;
    private int codigoFuncional;

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

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código Funcional: " + codigoFuncional);
    }
}
