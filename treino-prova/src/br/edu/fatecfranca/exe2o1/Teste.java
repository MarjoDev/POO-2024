package br.edu.fatecfranca.exe2o1;

import br.edu.fatecfranca.exe2o1.Cliente;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("01111-11", "100-00", "Fulano", 10000 );
        Cliente cliente2 = new Cliente();

        cliente.realizarDeposito(5000);
        cliente.realizarSaque(10000);
        cliente.mostrar();

        cliente2.realizarDeposito(5000);
        cliente2.realizarSaque(10000);
        cliente2.mostrar();
    }
}
