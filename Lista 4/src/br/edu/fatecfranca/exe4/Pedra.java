package br.edu.fatecfranca.exe4;

public class Pedra extends Coisa {

    @Override
    public String quemSou() {
        return "Pedra";
    }

    @Override
    public boolean vence(Coisa outraCoisa) {
        return outraCoisa instanceof Tesoura;
    }
}
