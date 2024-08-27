package org.example.exercicio9;

public class Main {
    public static void main(String[] args) {

        Comissao comissaoGerente = new Gerente(5000.00);
        Comissao comissaoSupervisor = new Supervisor(3000.00);
        Comissao comissaoVendedor = new Vendedor(2000.00);

        Funcionario funcionario1 = new Funcionario("João", 101, comissaoGerente);
        Funcionario funcionario2 = new Funcionario("Marcos", 102, comissaoSupervisor);
        Funcionario funcionario3 = new Funcionario("Thiago", 103, comissaoVendedor);
        Funcionario funcionario4 = new Funcionario("Maurício", 104, comissaoGerente);

        funcionario1.exibirInformacoes();
        System.out.println();
        funcionario2.exibirInformacoes();
        System.out.println();
        funcionario3.exibirInformacoes();
        System.out.println();
        funcionario4.exibirInformacoes();
    }
}
