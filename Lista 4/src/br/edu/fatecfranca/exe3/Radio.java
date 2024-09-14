package br.edu.fatecfranca.exe3;

public class Radio extends Produto {
    private double estacao;
    private String banda;

    public Radio(int numeroSerial, int volume, double estacao, String banda) {
        super(numeroSerial, volume);
        this.estacao = estacao;
        this.banda = banda;
    }

    public String escutar() {
        return "Escutando: " + estacao + " " + banda;
    }

    public void trocaEstacao(double novaEstacao) {
        this.estacao = novaEstacao;
    }

    public void trocaBanda(String novaBanda) {
        this.banda = novaBanda;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estação: " + estacao + " " + banda;
    }
}
