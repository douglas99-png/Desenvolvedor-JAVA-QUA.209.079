package com.objeto.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
      // instancia 
      Pessoa usuario = new Pessoa();
      Scanner leia = new Scanner (System.in);

      

      // define os valores do atributos
        System.out.println("Informe o nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe a idade: ");
        usuario.idade = leia.nextInt();
        System.out.println("Informe o altura: ");
        usuario.altura = leia.nextDouble();


        usuario.nome = "Douglas";
        usuario.idade = 20;
        usuario.altura = 1.75;

        // output
     usuario.exibirDados();
     System.out.println(usuario.cumprimentar());
     usuario.exibirDados();

     leia.close();
}
}