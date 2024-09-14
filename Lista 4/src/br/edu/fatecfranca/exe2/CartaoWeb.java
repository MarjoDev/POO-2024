package br.edu.fatecfranca.exe2;

// Classe abstrata CartaoWeb
public abstract class CartaoWeb {
    protected String destinatario;

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }

    // Método abstrato que será implementado pelas classes filhas
    public abstract void showMessage();
}
