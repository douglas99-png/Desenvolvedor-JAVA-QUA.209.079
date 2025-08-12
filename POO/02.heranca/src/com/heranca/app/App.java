package com.heranca.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // instanciar
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        

        //definido valores dos atributos
     System.out.println("Informe o nome do usuario: ");
     usuario.nome = leia.nextLine();

     System.out.println("Informe o CPF do usuario: ");
     usuario.cpf = leia.nextLine();

     System.out.println("Informe o e-mail do usuario: ");
     usuario.email = leia.nextLine();

     System.out.println("Informe o telefone do usuario: ");
     usuario.telefone = leia.nextLine();

     System.out.println("Informe o endereço do usuario: ");
     usuario.endereco = leia.nextLine();

     // definindo valores dos atributos

     System.out.println("Informe a razão social da empresa: ");
     empresa.razaoSocial = leia.nextLine();

     System.out.println("Informe a nome fantasia da empresa: ");
     empresa.nomeFantasia = leia.nextLine();

       System.out.println("Informe a CNPJ da empresa: ");
     empresa.cnpj = leia.nextLine();

     System.out.println("Informe a e-mail da empresa: ");
     empresa.email = leia.nextLine();

      System.out.println("Informe o telefone da empresa: ");
     usuario.telefone = leia.nextLine();

     System.out.println("Informe o endereço da empresa: ");
     usuario.endereco = leia.nextLine();

     leia.close();

    }
}
