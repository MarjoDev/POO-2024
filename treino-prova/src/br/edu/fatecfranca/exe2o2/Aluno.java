package br.edu.fatecfranca.exe2o2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    public Aluno() {
        this.numeroAluno = 0;
        this.nome = "";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        int digitos = String.valueOf(numeroAluno).length();
        if (digitos == 6){
            this.numeroAluno = numeroAluno;
        }
        else{
            System.out.println("O número do aluno não tem 6 digitos");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30 && !nome.isEmpty()){
            this.nome = nome;
        }
        else{
            System.out.println("O nome do aluno está em branco ou tem mais de 30 dígitos");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
        else{
            System.out.println("A idade não pode ser negativa");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if(p1 > 0){
            this.p1 = p1;
        }
        else{
            System.out.println("A nota da prova 1 não pode ser negativa");
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if(p2 > 0){
            this.p2 = p2;
        }
        else{
            System.out.println("A nota da prova 2 não pode ser negativa");
        }
    }

    public void notaFinal() {
        float media = (p1 + p2) / 2;
        System.out.println("Média final: " + media);
    }

    public void dadosAluno(){
        System.out.println(
                "Número do aluno: " + this.numeroAluno + "\nNome: " + this.nome + "\nIdade: " + this.idade + "\nP1: " + this.p1 + "\nP2: " + this.p2 + "\n"
        );
    }
}
