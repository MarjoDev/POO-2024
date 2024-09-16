package br.edu.fatecfranca.exe1o2;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    Cliente(){
        this.numeroConta = 0;
        this.numeroAgencia = 0;
        this.nome = "";
        this.saldo = 0;
    }
    Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito (float valor){
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }

    public void realizarSaque (float valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void dadosCliente(){
        System.out.println("Nome do cliente: " + this.nome + "\nNúmero da agência: " + this.numeroAgencia + "\nSaldo do cliente: " + this.saldo);
    }
}
