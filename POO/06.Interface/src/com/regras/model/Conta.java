package com.regras.model;

public class Conta {
    private String agencia;
    private String numero;
    private String banco;
    private String titular;
    private double saldo;

    public Conta(String agencia, String numero, String banco, String titular, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.banco = banco;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
        } else {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        }
    }

    public void exibirDados() {
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Banco: " + banco);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$%.2f\n", saldo);
    }
}
