package org.example.exercicio8;

public class Main {
    public static void main(String[] args) {
        Comissao gerente = new Gerente(5000.00);
        Comissao supervisor = new Supervisor(3000.00);
        Comissao vendedor = new Vendedor(2000.00);

        System.out.println("Salário do Gerente é de R$ " + gerente.calcularSalario());
        System.out.println("Salário do Supervisor é de R$ " + supervisor.calcularSalario());
        System.out.println("Salário do Vendedor é de R$ " + vendedor.calcularSalario());
    }
}
