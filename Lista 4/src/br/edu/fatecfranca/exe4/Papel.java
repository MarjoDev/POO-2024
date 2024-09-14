package br.edu.fatecfranca.exe4;

public class Papel extends Coisa {

    @Override
    public String quemSou() {
        return "Papel";
    }

    @Override
    public boolean vence(Coisa outraCoisa) {
        return outraCoisa instanceof Pedra;
    }
}
