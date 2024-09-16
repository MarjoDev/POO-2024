package br.edu.fatecfranca.exe1o1;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno(10, "zé", 20, 5, 10);

        aluno.notaFinal();
        aluno.dadosAluno();
        aluno.passou();

        aluno2.notaFinal();
        aluno2.dadosAluno();
        aluno2.passou();
    }
}
