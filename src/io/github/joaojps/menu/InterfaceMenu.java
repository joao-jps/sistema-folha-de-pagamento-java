package io.github.joaojps.menu;

import io.github.joaojps.funcionarios.Funcionario;

import java.util.Scanner;

public class InterfaceMenu {
    public void exibirInterfacePrincipal() {
        System.out.println("  \n" +
                "=== SISTEMA DE FOLHA DE PAGAMENTO ===\n" +
                "1 - Cadastrar funcionário\n" +
                "2 - Processar folha de pagamento\n" +
                "3 - Ver relatório\n" +
                "4 - Sair");
        System.out.println("Escolha uma opção: ");
    }


    public void exibirMenuCadastro() {
        System.out.println("Qual o cargo do funcionário que deseja cadastrar? ");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor");
        System.out.println("3 - Estagiário");
        System.out.println("4 - Voltar");
        System.out.println("5 - Sair");
        System.out.println("Escolha a opção desejada: ");

    }

//    public int verRelatorio() {
//        System.out.println("")
//    }

}
