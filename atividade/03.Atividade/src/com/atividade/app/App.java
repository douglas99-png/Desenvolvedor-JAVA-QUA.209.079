package com.atividade.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o CPF do titular: ");
        String cpf = entrada.nextLine();

        Conta minhaConta = new Conta(nome, cpf);

        int opcao;

        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Exibir dados da conta");
            System.out.println("2. Fazer saque");
            System.out.println("3. Fazer depósito");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    minhaConta.exibirDados();
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: R$");
                    double valorSaque = entrada.nextDouble();
                    minhaConta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o valor para depositar: R$");
                    double valorDeposito = entrada.nextDouble();
                    minhaConta.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        entrada.close();
    }
}
