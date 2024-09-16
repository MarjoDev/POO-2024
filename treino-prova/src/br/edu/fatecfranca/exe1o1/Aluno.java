package br.edu.fatecfranca.exe1o1;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;

    public Aluno(){
        this.numeroAluno = 0;
        this.nome = "";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }
    public Aluno (int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void notaFinal (){
        int media = (int) ((p1 + p2) / 2);
        System.out.println("\nMédia: " + media);
    }

    public void dadosAluno (){
        System.out.println("Nome: " + nome + " Idade: " + idade + " Numero Aluno: " + numeroAluno);
    }

    public void passou(){
        int media = (int)(p1 + p2) / 2;
        if(media >= 6){
            System.out.println("O aluno passou!");
        }
        else{
            System.out.println("O aluno foi reprovado!");
        }
    }
}
