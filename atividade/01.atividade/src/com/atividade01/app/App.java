package com.atividade01.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner (System.in);

        String nome;
        double peso, altura, imc;
        int opcao;
        do {
        // entrada 

        System.out.print("Digite o seu nome: ");
        nome = leia.nextLine();

        System.out.print("Digite o seu peso: ");
        peso = leia.nextDouble();

        // entrada da altura
        System.out.print("Digite a sua altura: ");
      altura = leia.nextDouble();


        // calculo do imc
      imc = peso / (altura * altura);

      // resultado
        System.out.printf("Seu IMC é: " + imc);

        // tabela do imc
        if (imc < 18.5) {
            System.out.printf(" ***** Baixo peso *****");
        } else if (imc < 25) {
            System.out.printf(" ***** Peso saudável *****");
        } else if (imc < 30) {
            System.out.printf(" ***** Sobrepeso *****");
        } else {
            System.out.printf(" ***** Obesidade *****");
        }

         
            // menu
            System.out.println("\nMenu:");
            System.out.println("1 - Registrar nova entrada");
            System.out.println("2 - Sair do programa");
            System.out.print("Informe a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine(); 

        } while (opcao != 2);


       leia.close();
    }
}
