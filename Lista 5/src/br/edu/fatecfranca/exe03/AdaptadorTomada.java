package br.edu.fatecfranca.exe03;

public class AdaptadorTomada implements TomadaDeDoisPinos {
    private TomadaDeTresPinos tomadaDeTresPinos;

    public AdaptadorTomada(TomadaDeTresPinos tomadaDeTresPinos) {
        this.tomadaDeTresPinos = tomadaDeTresPinos;
    }

    @Override
    public void conectar() {
        // Aqui estamos adaptando a chamada de dois pinos para três pinos
        tomadaDeTresPinos.conectarTresPinos();
    }
}

