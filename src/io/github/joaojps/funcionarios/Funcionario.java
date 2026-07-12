package io.github.joaojps.funcionarios;

public abstract class Funcionario {
    private String name;
    private String role;
    private int experience;
    private double baseSalary;

//    CRIANDO O CONSTRUTOR ( estrutura )

    public Funcionario(String name, String role, int experience, double baseSalary) {
        this.name = name;
        this.role = role;
        this.experience = experience;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void showResume (){
        System.out.println("O funcionario " +name+ " atua no cargo de " +role+ " e recebe um salário base de " +baseSalary+ " R$");
    }

    public double calcularBonusHoraExtra(int horasTrabalhadas) {
        int metaHorasMensal = 220;
        double bonusHoraExtra = 100.0;

        double bonus = 0;

        if (horasTrabalhadas > metaHorasMensal) {
            int horasExcedentes = horasTrabalhadas - metaHorasMensal;
            bonus = horasExcedentes * bonusHoraExtra;
        }

        return bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
