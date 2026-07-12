package io.github.joaojps.funcionarios;

public class Vendedor extends Funcionario {
    private int totalVendas;

    public Vendedor (String name, String role, int experience, double baseSalary, int totalVendas) {
        super(name, role, experience, baseSalary);
        this.totalVendas = totalVendas;
    }

    public void checkGoal() {
        if (totalVendas < 20) {
            System.out.println("Meta abaixo e/ou não cumprida. ");
        } else {
            System.out.println("Meta de vendas atingida. ");
        }
    }

    @Override
    public double calculateSalary() {
       double comission = totalVendas * 1.75;
       return getBaseSalary() + comission;
    }

    @Override
    public void showResume() {
        super.showResume();
        System.out.println("e realizou um total de vendas de: " +totalVendas);
        checkGoal();
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }
}
