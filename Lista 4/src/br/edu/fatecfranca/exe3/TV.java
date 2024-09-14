package br.edu.fatecfranca.exe3;

public class TV extends Produto {
    private int canal;

    public TV(int numeroSerial, int volume, int canal) {
        super(numeroSerial, volume);
        this.canal = canal;
    }

    public String assistir() {
        return "Assistindo canal: " + canal;
    }

    public void trocaCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Canal: " + canal;
    }
}
