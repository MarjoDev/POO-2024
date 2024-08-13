package br.edu.fatecfranca;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente Fulano = new Cliente(1, "Fulano", 100, 10000);
        Cliente Beltrano = new Cliente(2, "Beltrano", 110, 100000);

        Fulano.realizarDeposito(5000);
        Fulano.realizarSaque(3000);
        Fulano.returnCliente();

        Beltrano.realizarDeposito(50000);
        Beltrano.realizarSaque(100000);
        Beltrano.returnCliente();


    }
}
