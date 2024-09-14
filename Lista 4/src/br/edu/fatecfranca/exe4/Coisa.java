package br.edu.fatecfranca.exe4;

public abstract class Coisa {
    public abstract String quemSou();

    public abstract boolean vence(Coisa outraCoisa);

    @Override
    public String toString() {
        return this.quemSou();
    }
}
