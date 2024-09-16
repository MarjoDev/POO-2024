package br.edu.fatecfranca.exe4o3;

public class Produto {
    protected int numeroSerial;
    protected int volume;
    protected String teste = "Não testado";
    protected boolean testado;

    public Produto() {
        this.numeroSerial = 0;
        this.volume = 0;
    }
    public Produto(int numeroSerial, int volume) {
        this.numeroSerial = numeroSerial;
        this.volume = volume;
    }

    public boolean testaUnidade() {
        if (testado) {
            System.out.println("Unidade já testada.");
            return "aprovado".equals(teste);
        }

        double chance = Math.random();
        if (chance <= 0.9) {
            teste = "aprovado";
        } else {
            teste = "reprovado";
        }
        testado = true;
        return "aprovado".equals(teste);
    }

    public void setaVolume(int volume) {
        this.volume = volume;
    }
}
