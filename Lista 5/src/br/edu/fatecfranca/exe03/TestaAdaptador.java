package br.edu.fatecfranca.exe03;

public class TestaAdaptador {
    public static void main(String[] args) {
        // Criando uma tomada de três pinos
        TomadaDeTresPinos tomadaDeTresPinos = new TomadaDeTresPinos();

        // Adaptando para uma tomada de dois pinos
        TomadaDeDoisPinos adaptador = new AdaptadorTomada(tomadaDeTresPinos);

        // Agora podemos conectar uma tomada de três pinos usando a interface de dois pinos
        adaptador.conectar();
    }
}
