package br.edu.fatecfranca.exe4o2;

public class DiaDosNamorados extends CartaoWeb{
    public DiaDosNamorados(String destinatario){
        super(destinatario);
    }


    @Override
    public void showMessage() {
        System.out.println("Feliz dia dos namorados " + destinatario + ", felicidades!");
    }
}
