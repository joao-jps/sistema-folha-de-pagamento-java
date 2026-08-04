package io.github.joaojps.funcionarios;

public class Estagiario extends Funcionario {
    private int workedHours;
    private int studyTime;
    private int projectsMade;
    private int bonusPerProject;


    public Estagiario(String name, String role, int experience, double baseSalary, int studyTime, int projectsMade) {
        super(name, role, experience, baseSalary);
        this.studyTime = studyTime;
        this.projectsMade = projectsMade;
    }

    @Override
    public void showResume() {
        super.showResume();
        System.out.println("O estagiario " + getName() + " ");
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    public void checkMetas() {
        if (studyTime < 400) {
            System.out.println("Meta de tempo de estudo não atingida, restaram " + (400 - studyTime) + " horas para completar a meta final.");
        } else {
            System.out.println("Meta de tempo de estudo atingida. ");
        }

        if (projectsMade < 2) {
            System.out.println("Meta de projetos realizados abaixo do esperado. ");
        } else if (projectsMade > 4) {
            System.out.println("Meta de projetos ultrapassada. ");
            double bonusPerProject = getBaseSalary() + 200;
        }
    }
}

