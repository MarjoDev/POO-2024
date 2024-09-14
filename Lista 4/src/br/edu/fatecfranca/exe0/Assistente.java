package br.edu.fatecfranca.exe0;

public class Assistente extends Funcionario {
    private float horaExtra;

    public Assistente() {
        super();
        this.horaExtra = 0;
    }

    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                super.toString() +
                ", Hora extra=" + horaExtra +
                '}';
    }

    @Override
    public float calcularSalario() {
        return this.salario + this.horaExtra * 40.0f;
    }
}

