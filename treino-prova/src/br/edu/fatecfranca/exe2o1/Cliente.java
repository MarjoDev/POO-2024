package br.edu.fatecfranca.exe2o1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        // Verifica se o número da conta tem 8 caracteres
        if (numeroConta.length() == 8 && numeroConta.contains("-")) {
            this.numeroConta = numeroConta;
        } else {
            throw new IllegalArgumentException("O número da conta deve ter 8 caracteres, incluindo o traço.");
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        // Verifica se o número da conta tem 8 caracteres
        if (numeroAgencia.length() == 6 && numeroAgencia.contains("-")) {
            this.numeroAgencia = numeroAgencia;
        } else {
            throw new IllegalArgumentException("O número da agência deve ter 6 caracteres, incluindo o traço.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30 && !nome.isEmpty()) {
            this.nome = nome;
        }
        else{
            throw new IllegalArgumentException("O nome não pode ser vazio ou maior que 30");
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
        else {
            throw new IllegalArgumentException("O saldo não pode ser negativo");
        }
    }

    public Cliente(){
        this.numeroConta = "";
        this.numeroAgencia = "";
        this.nome = "";
        this.saldo = 0;
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float valor){
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }

    public void realizarSaque(float valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void mostrar(){
        System.out.println(
                "\nNumero Conta: " + numeroConta +
                "\nNúmero Agência: " + numeroAgencia +
                "\nNome do cliente: " + nome +
                "\nSaldo: " + saldo
        );
    }
}
