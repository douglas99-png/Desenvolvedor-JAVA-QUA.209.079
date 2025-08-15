package com.quatropilares.app;

import java.util.Scanner;

import com.quatropilares.model.PessoaFisica;
import com.quatropilares.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
             PessoaFisica usuario = new PessoaFisica("", "", "", "", "", "");
             PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);

            // input usuario
            System.out.println("Informe dados do usuário: ");
            System.out.println("Informe o nome: ");
            usuario.setNome(leia.nextLine());
            System.out.println("Informe o CPF: ");
            usuario.setCpf(leia.nextLine());
            System.out.println("Informe a data de nascimento: ");
            usuario.setDataNascimento(leia.nextLine());
            System.out.println("Informe o e-mail: ");
            usuario.setEmail(leia.nextLine());
            System.out.println("Informe o telefone: ");
            usuario.setTelefone(leia.nextLine());
            System.out.println("Informe o endereço: ");
            usuario.setEndereco(leia.nextLine());



            // input empresa
                System.out.println("Informe dados da empresa ");
                System.out.println("Informe o razão social: ");
                empresa.setRazaoSocial(leia.nextLine());
                System.out.println("Informe o CNPJ: ");
                empresa.setCNPJ(leia.nextLine());
                System.out.println("Informe nome da empresa: ");
                empresa.setNomeFantasia(leia.nextLine());
                System.out.println("Informe o e-mail: ");
                usuario.setEmail(leia.nextLine());
                System.out.println("Informe o telefone: ");
                empresa.setTelefone(leia.nextLine());
                System.out.println("Informe o endereço: ");
                empresa.setEndereco(leia.nextLine());


            // output
                    System.out.println("Informe dados do usuário: ");
                    System.out.println("Informe o nome: " + usuario.getNome());
              
                    System.out.println("Informe o CPF: " + usuario.getCpf());
                  
                    System.out.println("Informe a data de nascimento: " + usuario.getDataNascimento());
                 
                    System.out.println("Informe o e-mail: " + usuario.getEmail());
                
                    System.out.println("Informe o telefone: " + usuario.getTelefone());
                  
                    System.out.println("Informe o endereço: " + usuario.getEndereco());



            System.out.println("Informe dados da empresa ");
                System.out.println("Informe o razão social: " + empresa.getRazaoSocial());
                System.out.println("Informe o CNPJ: " + empresa.getCNPJ());
             
                System.out.println("Informe nome da empresa: " + empresa.getNomeFantasia());
           
                System.out.println("Informe o e-mail: " + empresa.getEmail());
         
                System.out.println("Informe o telefone: " +empresa.getTelefone());
         
                System.out.println("Informe o endereço: " + empresa.getEndereco());
            
            

        leia.close();
    }
}
