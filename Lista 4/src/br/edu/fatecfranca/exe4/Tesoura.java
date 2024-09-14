package br.edu.fatecfranca.exe4;

public class Tesoura extends Coisa {

    @Override
    public String quemSou() {
        return "Tesoura";
    }

    @Override
    public boolean vence(Coisa outraCoisa) {
        return outraCoisa instanceof Papel;
    }
}
