package br.edu.fatecfranca.exe4o2;

public class Natal extends CartaoWeb{
    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz natal " + destinatario + ", felicidades!");
    }
}
