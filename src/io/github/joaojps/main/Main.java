package io.github.joaojps.main;

import io.github.joaojps.funcionarios.*;
import io.github.joaojps.menu.InterfaceMenu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static InterfaceMenu menu = new InterfaceMenu();
    static List<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 4) {
            menu.exibirInterfacePrincipal();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> processarFolha();
                case 3 -> exibirRelatorio();
                case 4 -> System.out.println("\nEncerrando o sistema. Até logo!");
                default -> System.out.println("\nOpção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void cadastrarFuncionario() {
        menu.exibirMenuCadastro();
        int cargo = scanner.nextInt();
        scanner.nextLine();

        if (cargo == 4 || cargo == 5) return;

        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Cargo/função: ");
        String role = scanner.nextLine();
        System.out.print("Anos de experiência: ");
        int experience = scanner.nextInt();
        System.out.print("Salário base: R$ ");
        double baseSalary = scanner.nextDouble();

        switch (cargo) {
            case 1 -> {
                System.out.print("Valor do bônus (Gerente): R$ ");
                double bonusAdd = scanner.nextDouble();
                funcionarios.add(new Gerente(name, role, experience, baseSalary, bonusAdd));
            }
            case 2 -> {
                System.out.print("Total de vendas: ");
                int totalVendas = scanner.nextInt();
                funcionarios.add(new Vendedor(name, role, experience, baseSalary, totalVendas));
            }
            case 3 -> {
                System.out.print("Horas de estudo até agora: ");
                int studyTime = scanner.nextInt();
                System.out.print("Projetos realizados: ");
                int projectsMade = scanner.nextInt();
                funcionarios.add(new Estagiario(name, role, experience, baseSalary, studyTime, projectsMade));
            }
            default -> {
                System.out.println("Cargo inválido!");
                return;
            }
        }

        System.out.println("\nFuncionário cadastrado com sucesso!");
        scanner.nextLine();
        pausar();
    }

    private static void processarFolha() {
        if (funcionarios.isEmpty()) {
            System.out.println("\nNenhum funcionário cadastrado ainda.");
            scanner.nextLine();
            pausar();
            return;
        }

        System.out.println("\n=== PROCESSAMENTO DA FOLHA DE PAGAMENTO ===");

        for (Funcionario f : funcionarios) {
            System.out.println("\nFuncionário: " + f.getName());
            System.out.print("Horas trabalhadas no mês: ");
            int horasTrabalhadas = scanner.nextInt();

            double bonusHoraExtra = f.calcularBonusHoraExtra(horasTrabalhadas);
            double salarioFinal = f.calculateSalary() + bonusHoraExtra;

            System.out.printf("   Bônus hora extra: R$ %.2f%n", bonusHoraExtra);
            System.out.printf("   Salário final:    R$ %.2f%n", salarioFinal);
        }

        scanner.nextLine();
        pausar();
    }

    private static void exibirRelatorio() {
        Collections.sort(funcionarios);

        if (funcionarios.isEmpty()) {
            System.out.println("\nNenhum funcionário cadastrado ainda.");
            scanner.nextLine();
            pausar();
            return;
        }

        System.out.println("\n================ RELATÓRIO GERAL ================");

        for (Funcionario f : funcionarios) {
            f.showResume();

            if (f instanceof Estagiario estagiario) {
                estagiario.checkMetas();
            }

            System.out.printf("Salário calculado: R$ %.2f%n", f.calculateSalary());
            System.out.println("--------------------------------------------------");
        }
        scanner.nextLine();
        pausar();
    }

    private static void pausar() {
        System.out.println("\nPressione ENTER para voltar ao menu de opções.");
        scanner.nextLine();
    }
}