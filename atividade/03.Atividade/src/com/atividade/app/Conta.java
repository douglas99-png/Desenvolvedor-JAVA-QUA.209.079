package com.atividade.app;

public class Conta {
    // atributos 
    String titular;
    String cpf;
    String agencia;
    String numeroConta;
    double saldo;

    // construtor 
    public Conta(String nomeTitular, String cpfTitular) {
        titular = nomeTitular;
        cpf = cpfTitular;
        agencia = "0001"; 
        numeroConta = "12345"; 
        saldo = 0.0;
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("CPF: " + cpf);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
    }

    // saque
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Valor inválido ou saldo insuficiente.");
        }
    }

    // depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido.");
        }
    }
}


