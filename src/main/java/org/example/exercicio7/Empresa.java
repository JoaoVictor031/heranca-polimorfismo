package org.example.exercicio7;

public class Empresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new FuncionarioEnsinoBasico("Freancklin", 102, "Escola Municipal Básica A");
        funcionarios[1] = new FuncionarioEnsinoBasico("Trevor", 103, "Escola Municipal Básica B");
        funcionarios[2] = new FuncionarioEnsinoBasico("Michael", 104, "Escola Municipal Básica C");
        funcionarios[3] = new FuncionarioEnsinoBasico("Marcos", 105, "Escola Municipal Básica D");
        funcionarios[4] = new FuncionarioEnsinoMedio("Cleiton", 106, "Escola Municipal Básica E", "Escola de Nível Médio X");
        funcionarios[5] = new FuncionarioEnsinoMedio("Mário", 107, "Escola Municipal Básica F", "Escola de Nível Médio Y");
        funcionarios[6] = new FuncionarioEnsinoMedio("Sonic", 108, "Escola Municipal Básica G", "Escola de Nível Médio Z");
        funcionarios[7] = new FuncionarioEnsinoMedio("Lucia", 109, "Escola Municipal Básica H", "Escola de Nível Médio W");
        funcionarios[8] = new FuncionarioGraduado("João", 110, "Escola Municipal Básica I", "Escola de Nível Médio V", "Universidade Federal U");
        funcionarios[9] = new FuncionarioGraduado("Thiago", 111, "Escola Municipal Básica J", "Escola de Nível Médio T", "Universidade Federal S");

        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoGraduacao = 0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularRendaTotal();
            custoTotal += salario;

            if (funcionario instanceof FuncionarioGraduado) {
                custoGraduacao += salario;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoEnsinoMedio += salario;
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoEnsinoBasico += salario;
            }
        }

        System.out.println("Custo total com salários: R$ " + custoTotal);
        System.out.println("Custo dos funcionários do ensino básico: R$" + custoEnsinoBasico);
        System.out.println("Custo dos funcionários do ensino médio: R$" + custoEnsinoMedio);
        System.out.println("Custo dos funcionários graduados: R$" + custoGraduacao);
    }
}
