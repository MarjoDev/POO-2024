package br.edu.fatecfranca;

public class Aluno {
    public int numeroAluno;
    public String nomeAluno;
    public int idadeAluno;
    public float p1Aluno;
    public float p2Aluno;

    public Aluno(int numeroAluno, String nomeAluno, int idadeAluno, float p1Aluno, float p2Aluno){
        this.numeroAluno = numeroAluno;
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.p1Aluno = p1Aluno;
        this.p2Aluno = p2Aluno;
    }

    public void notaFinal(){
        int media = (int)(p1Aluno + p2Aluno) / 2;
        System.out.println("A nota do aluno é " + media);
    }

    public void dadosAluno(){
        System.out.println("Aluno: " + nomeAluno + " Numero Aluno: " + numeroAluno + " Idade Aluno: " + idadeAluno) ;
    }
    
}

