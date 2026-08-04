package io.github.joaojps.funcionarios;

public class Gerente extends Funcionario {
        private double bonusAdd;

    public Gerente(String name, String role, int experience, double baseSalary, double bonusAdd) {
        super(name, role, experience, baseSalary);
        this.bonusAdd = bonusAdd;
    }


    @Override
    public void showResume() {
        super.showResume();
        System.out.println("Atua no cargo há "+getExperience() + " anos ");
    }

    @Override
    public double calculateSalary() {
        double bonusTotal = bonusAdd * 0.80;
        return getBaseSalary() + bonusTotal;
    }

    public double getBonusAdd() {
        return bonusAdd;
    }

    public void setBonusAdd(double bonusAdd) {
        this.bonusAdd = bonusAdd;
    }


}
