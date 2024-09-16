package br.edu.fatecfranca.exe2o2;

public class Teste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(123456, "João", 20, 8.5f, 7.0f);
        Aluno a2 = new Aluno();

        a1.notaFinal();
        a1.dadosAluno();

        a2.notaFinal();
        a2.dadosAluno();
    }
}
