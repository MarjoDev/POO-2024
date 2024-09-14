package br.edu.fatecfranca.exe2;

// Classe Natal que estende CartaoWeb
public class Natal extends CartaoWeb {
    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Natal, " + destinatario + "! Que você tenha muita paz e alegria!");
    }
}