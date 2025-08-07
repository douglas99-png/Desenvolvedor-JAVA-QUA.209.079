package com.atividade2.app;
import java.util.Scanner;

public class App {
  
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);

        String nome;
         int idade, sala;

    
        System.out.print("Digite seu nome: ");
         nome = leia.nextLine();


        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        boolean ingressoEmitido = false;

        while (!ingressoEmitido) {
       
            System.out.println("\nSalas disponíveis:");
            System.out.println("1 - Divertidamente 2 - Livre");
            System.out.println("2 - Vingadores: Ultimato - 12 anos");
            System.out.println("3 - Deadpool - 16 anos");
            System.out.println("4 - Jogos Vorazes - 14 anos");
            System.out.println("5 - O Massacre da Serra Elétrica 18 - anos");

            System.out.print("\nEscolha o número da sala desejada 1 a 5: ");
            sala = leia.nextInt();

            if (sala == 1) {
                System.out.println("\nIngresso emitido com sucesso!");
                System.out.println("Nome: " + nome);
                System.out.println("Filme: Divertidamente 2");
                ingressoEmitido = true;

            } else if (sala == 2) {
                if (idade >= 12) {
                    System.out.println("\nIngresso emitido com sucesso!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Filme: Vingadores: Ultimato");
                    ingressoEmitido = true;
                } else {
                    System.out.println("\nVocê não tem idade suficiente para este filme.");
                }

            } else if (sala == 3) {
                if (idade >= 16) {
                    System.out.println("\nIngresso emitido com sucesso!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Filme: Deadpool");
                    ingressoEmitido = true;
                } else {
                    System.out.println("\nVocê não tem idade suficiente para este filme.");
                }

            } else if (sala == 4) {
                if (idade >= 14) {
                    System.out.println("\nIngresso emitido com sucesso!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Filme: Jogos Vorazes");
                    ingressoEmitido = true;
                } else {
                    System.out.println("\nVocê não tem idade suficiente para este filme.");
                }

            } else if (sala == 5) {
                if (idade >= 18) {
                    System.out.println("\nIngresso emitido com sucesso!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Filme: O Massacre da Serra Elétrica");
                    ingressoEmitido = true;
                } else {
                    System.out.println("\nVocê não tem idade suficiente para este filme.");
                }

            } else {
                System.out.println("\nSala inválida. Tente novamente.");
            }
        }   
    leia.close();
    }
        
}
