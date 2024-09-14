package br.edu.fatecfranca.exe3;

public class Produto {
    private int numeroSerial;
    private int volume;
    private String resultadoTeste;
    private boolean testado;

    public Produto(int numeroSerial, int volume) {
        this.numeroSerial = numeroSerial;
        this.volume = volume;
        this.resultadoTeste = "não testado";
        this.testado = false;
    }

    public boolean testaUnidade() {
        if (testado) {
            System.out.println("Unidade já testada.");
            return "aprovado".equals(resultadoTeste);
        }

        double chance = Math.random();
        if (chance <= 0.9) {
            resultadoTeste = "aprovado";
        } else {
            resultadoTeste = "reprovado";
        }
        testado = true;
        return "aprovado".equals(resultadoTeste);
    }

    public void setaVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Produto [Serial: " + numeroSerial + ", Volume: " + volume + ", Teste: " + resultadoTeste + "]";
    }
}
