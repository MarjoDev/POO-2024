package br.edu.fatecfranca;

public class Gerente extends Funcionario {
    private float bonus;

    public Gerente() {
        super(); // chama construtor sem parametros da superclasse
        this.bonus = 0;
    }

    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario); // chama construtor com parametros da superclasse
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                super.toString() +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public float calcularSalario() {
        return this.salario + bonus;
    }
}
