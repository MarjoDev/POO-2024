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
        String aux = String.valueOf(ra);
        if (ra > 0 && aux.length() == 8){
            this.ra = ra;
        }
        else{
            throw new IllegalArgumentException("Ra deve ser maior que zero e ter 8 digitos");
        }
    }

    public void setMedia(float media) {
        if (media >= 0 && media <= 10){
            this.media = media;
        }
        else{
            throw new IllegalArgumentException("Media deve estar entre 0 e 10");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public long getRa() {
        return this.ra;
    }

    public float getMedia() {
        return this.media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                ", media=" + media +
                '}';
    }
}
