package br.edu.fatecfranca.exe5;

public class ContaEspecial extends Conta {

    public ContaEspecial(Cliente cliente, int numeroConta, double saldoInicial, double limite) {
        super(cliente, numeroConta, saldoInicial, limite);

        // Ajustar o limite para aceitar até 3 vezes o salário do cliente
        double limiteMaximo = cliente.getSalario() * 3;
        if (limite > limiteMaximo) {
            // Ajusta o limite para o valor máximo permitido
            // Não chamamos o construtor da superclasse diretamente para evitar redefinir o limite
            this.limite = limiteMaximo;
        }
    }
}
