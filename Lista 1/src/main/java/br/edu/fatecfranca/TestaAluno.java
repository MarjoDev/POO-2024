package br.edu.fatecfranca;

public class TestaAluno {

    public static void main(String[] args) {
        Aluno Aluno1 = new Aluno(1, "Zé", 18, 5, 10);
        Aluno Aluno2 = new Aluno(2, "Lé", 20, 7, 3);

        Aluno1.notaFinal();
        Aluno2.notaFinal();

        Aluno1.dadosAluno();
        Aluno2.dadosAluno();
    }
}
