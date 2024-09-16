package br.edu.fatecfranca.exe3o2;

public class Disciplina {
    public int id;
    public String name;
    public String sigla;

    public Disciplina() {
        this.id = 0;
        this.name = "";
        this.sigla = "";
    }

    public Disciplina(int id, String name, String sigla) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
