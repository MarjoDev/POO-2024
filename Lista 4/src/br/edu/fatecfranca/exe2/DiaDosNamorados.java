package br.edu.fatecfranca.exe2;

// Classe DiaDosNamorados que estende CartaoWeb
public class DiaDosNamorados extends CartaoWeb {
    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Dia dos Namorados, " + destinatario + "! Te amo muito!");
    }
}
