package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.model.Conta;
import com.composicao.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa(null,
         null,
         null, 
         null, 
         null);

         Conta cc = new Conta("1234-5", 
         "147258-3", 
         0, 
         usuario);

         String[] opcoes = {"Exibir dados da conta", "Fazer depósito", "Fazer saque", "Sair"};

         Object opcao;

         // input do titular da conta
            usuario.setNome(JOptionPane.showInputDialog("Informe o nome do titular da conta"));
            usuario.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular da conta"));
            usuario.setEmail(JOptionPane.showInputDialog("Informe o e-mail do titular da conta"));
            usuario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do titular da conta"));
            usuario.setEndereco(JOptionPane.showInputDialog("Informe o endereço do titular da conta"));

            do {
                opcao = JOptionPane.showInputDialog(null,
                "Escolha a operação desejada: ",
                "JavaBank",
                JOptionPane.QUESTION_MESSAGE,
                null,
                 opcoes,
                opcoes[0]
                );

                switch (opcao.toString()) {
                    case "Exibir dados da conta":
                        JOptionPane.showMessageDialog(null,
                        cc.exibirDados(),
                        null,
                        JOptionPane.INFORMATION_MESSAGE   
                );
                        break;

                case "Fazer depósito":
                // 
                    



                    default:
                        break;
                }

            } while(opcao !="Sair" );
    }
}
