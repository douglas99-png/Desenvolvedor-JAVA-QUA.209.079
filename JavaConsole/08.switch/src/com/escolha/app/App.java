package com.escolha.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);


        // declaração
        int x, y;
        double result;
        String operacao;

        System.out.println("Informe o valor de x: ");
        x = leia.nextInt();

        System.out.println("Informe o valor de y: ");
        y = leia.nextInt();


        // limpeza de buffer
        leia.nextLine();


        // menu
        System.out.println("Escolha a operação");
        System.out.println("1- Soma.");
        System.out.println("2- Subtração.");
        System.out.println("3- Multiplicação.");
        System.out.println("4- Divisão. ");
        System.out.println("Operação desejada ");
        operacao = leia.nextLine();


        switch (operacao) {
            case "1":
                    result = x + y;
                    System.out.println("O resultado da soma é: " +result);
                    break;
            case "2":
                    result = x - y;
                    System.out.println("O resultado da subtração é: " +result);
                    break;
            case "3":
                    result = x * y;
                    System.out.println("O resultado da divisão é: " +result);
                    break;   
            case "4":
                    result = x / y;
                    System.out.println("O resultado da multiplicação é: " +result);
                    break;
        
            default:
                System.out.println("opção inválida ");
                break;
        }

        leia.close();
    }
}
