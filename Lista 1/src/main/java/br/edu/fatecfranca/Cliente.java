package br.edu.fatecfranca;

public class Cliente {
    public int numeroConta;
    public String nome;
    public int numeroAgencia;
    public float saldo;

    public Cliente(int numeroConta, String nome, int numeroAgencia, float saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public void realizarDeposito(float valor) {
        this.saldo += valor;
    }

    public void realizarSaque(float valor) {
        this.saldo -= valor;
    }

    public void returnCliente(){
        System.out.println("Número de conta: " + this.numeroConta + "\nNome: " + this.nome + "\nNumero Agencia: " + this.numeroAgencia + "\nSaldo: " + this.saldo );
    }
}
