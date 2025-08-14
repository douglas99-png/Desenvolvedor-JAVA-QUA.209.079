package com.regras.app;

import java.util.Scanner;
import com.regras.model.Conta;

public class App {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // Criando uma conta com dados fictícios
        Conta cc = new Conta("0001", "12345-6", "Banco XPTO", "João da Silva", 1000.0);

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Exibir dados da conta");
            System.out.println("2. Fazer saque");
            System.out.println("3. Fazer depósito");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            while (!leia.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                leia.next();
            }
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    cc.exibirDados();
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: R$");
                    double valorSaque = leia.nextDouble();
                    cc.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("Digite o valor para depositar: R$");
                    double valorDeposito = leia.nextDouble();
                    cc.depositar(valorDeposito);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        leia.close();
    }
}
