package br.edu.fatecfranca.exe2;

import java.util.List;

public class Disciplina {
    private int id;
    private String name;
    private String sigla;
    private Professor professor;
    private Curso curso;
    private List<Aluno> alunos;

    public Disciplina(int id, String name, String sigla, Professor professor, Curso curso, List<Aluno> alunos) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
        this.professor = professor;
        this.curso = curso;
        this.alunos = alunos;
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

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
