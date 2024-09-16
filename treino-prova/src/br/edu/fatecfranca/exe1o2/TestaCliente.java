package br.edu.fatecfranca.exe1o2;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(1, 1000, "Fulano", 5000);
        Cliente beltrano = new Cliente(2, 2000, "Beltrano", 2000);

        fulano.realizarDeposito(1000);
        fulano.realizarSaque(5000);
        fulano.dadosCliente();

        beltrano.realizarDeposito(1000);
        beltrano.realizarSaque(5000);
        beltrano.dadosCliente();
    }
}
