package br.edu.fatecfranca.exe3o2;

public class Aluno {
    public int id;
    public String nome;
    public String username;

    public Aluno(){
        this.id = 0;
        this.nome = "";
        this.username = "";
    }

    public Aluno(int id, String nome, String username) {
        this.id = id;
        this.nome = nome;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
