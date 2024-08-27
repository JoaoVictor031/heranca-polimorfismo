package org.example.exercicioFim;

public class Empresa {
    public static void main(String[] args) {
        double custoTotal = 0.0;
        double custoBasico = 0.0;
        double custoMedio = 0.0;
        double custoSuperior = 0.0;

        Funcionario[] funcionarios = new Funcionario[10];
        funcionarios[0] = new FuncionarioEnsinoBasico("Freancklin", 102, "Escola Municipal Básica A");
        funcionarios[1] = new FuncionarioEnsinoBasico("Trevor", 103, "Escola Municipal Básica B");
        funcionarios[2] = new FuncionarioEnsinoBasico("Michael", 104, "Escola Municipal Básica C");
        funcionarios[3] = new FuncionarioEnsinoBasico("Marcos", 105, "Escola Municipal Básica D");
        funcionarios[4] = new FuncionarioEnsinoMedio("Cleiton", 106, "Escola de Nível Médio A");
        funcionarios[5] = new FuncionarioEnsinoMedio("Mário", 107, "Escola de Nível Médio B");
        funcionarios[6] = new FuncionarioEnsinoMedio("Sonic", 108, "Escola de Nível Médio C");
        funcionarios[7] = new FuncionarioEnsinoMedio("Lucia", 109, "Escola de Nível Médio D");
        funcionarios[8] = new FuncionarioGraduado("João", 110, "Universidade Federal A");
        funcionarios[9] = new FuncionarioGraduado("Thiago", 111, "Universidade Federal B");

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calcularRendaTotal();
            custoTotal += renda;

            if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoBasico += renda;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoMedio += renda;
            } else if (funcionario instanceof FuncionarioGraduado) {
                custoSuperior += renda;
            }
        }

        System.out.println("Custo total com salários: R$ " + custoTotal);
        System.out.println("Custo com funcionários de ensino básico: R$ " + custoBasico);
        System.out.println("Custo com funcionários de ensino médio: R$ " + custoMedio);
        System.out.println("Custo com funcionários de nível superior: R$ " + custoSuperior);

        custoTotal = 0.0;
        double custoGerente = 0.0;
        double custoSupervisor = 0.0;
        double custoVendedor = 0.0;

        funcionarios[0] = new Gerente("Tiago", 11);
        funcionarios[1] = new Supervisor("Marcus", 12);
        funcionarios[2] = new Supervisor("Fernanda", 13);
        funcionarios[3] = new Vendedor("Daniel", 14);
        funcionarios[4] = new Vendedor("João", 15);
        funcionarios[5] = new Vendedor("Lucas", 16);
        funcionarios[6] = new Vendedor("Bruno", 17);
        funcionarios[7] = new Vendedor("Enzo", 18);
        funcionarios[8] = new Vendedor("Mateus", 19);
        funcionarios[9] = new Vendedor("Irineu", 20);

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calcularRendaTotal();
            custoTotal += renda;

            if (funcionario instanceof Gerente) {
                custoGerente += renda;
            } else if (funcionario instanceof Supervisor) {
                custoSupervisor += renda;
            } else if (funcionario instanceof Vendedor) {
                custoVendedor += renda;
            }
        }

        System.out.println("\nCusto total com salários: R$ " + custoTotal);
        System.out.println("Custo com Gerentes: R$ " + custoGerente);
        System.out.println("Custo com Supervisores: R$ " + custoSupervisor);
        System.out.println("Custo com Vendedores: R$ " + custoVendedor);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
