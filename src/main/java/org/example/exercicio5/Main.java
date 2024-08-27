package org.example.exercicio5;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Cleiton", 101);
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Mário", 102, "Escola Municipal Graças Assis");
        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Marcelo", 103, "Escola Municipal Romero Brito", "Colégio Modelo");
        FuncionarioGraduado funcionario4 = new FuncionarioGraduado("João", 104, "Escola Municipal Arminda Azevedo", "IFBA", "Anhanguera");

        funcionario1.exibirInformacoes();
        System.out.println();

        funcionario2.exibirInformacoes();
        System.out.println();

        funcionario3.exibirInformacoes();
        System.out.println();

        funcionario4.exibirInformacoes();
    }
}
