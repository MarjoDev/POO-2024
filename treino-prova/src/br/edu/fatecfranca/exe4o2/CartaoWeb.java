package br.edu.fatecfranca.exe4o2;

public abstract class CartaoWeb {
    protected String destinatario;

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    public abstract void showMessage();
}
