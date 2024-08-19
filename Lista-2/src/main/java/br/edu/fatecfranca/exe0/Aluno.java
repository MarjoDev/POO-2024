package br.edu.fatecfranca.exe0;

public class Aluno {
    public String nome;
    public long ra;
    public float media;

    public Aluno(){
    }
    public Aluno(String nome, long ra, float media) {
        this.nome = nome;
        this.ra = ra;
        this.media = media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(long ra) {
        if (ra > 0){
            this.ra = ra;
        }
    }

    public void setMedia(float media) {
        if (media > 0){
            this.media = media;
        }
    }
}
