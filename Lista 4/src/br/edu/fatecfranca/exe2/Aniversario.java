package br.edu.fatecfranca.exe2;

// Classe Aniversario que estende CartaoWeb
public class Aniversario extends CartaoWeb {
    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Aniversário, " + destinatario + "! Muitos anos de vida e sucesso!");
    }
}
