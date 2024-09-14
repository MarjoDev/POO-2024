package br.edu.fatecfranca.exe5;

public class Conta {
    private Cliente cliente;
    private int numeroConta;
    private double saldo;
    protected double limite;

    public Conta(Cliente cliente, int numeroConta, double saldoInicial, double limite) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;

        // O limite não pode ser maior que o salário do cliente
        if (limite > cliente.getSalario()) {
            this.limite = cliente.getSalario();
        } else {
            this.limite = limite;
        }
    }

    // Método para realizar um depósito
    public void deposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para realizar uma retirada
    public boolean retira(double valor) {
        if (valor > 0 && saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Retirada de R$" + valor + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Retirada falhou. Saldo ou limite insuficiente.");
            return false;
        }
    }

    // Método para retornar o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para obter informações sobre a conta
    public String getDetalhesConta() {
        return "Cliente: " + cliente.getNome() +
                "\nNúmero da Conta: " + numeroConta +
                "\nSaldo: R$" + saldo +
                "\nLimite: R$" + limite;
    }
}
