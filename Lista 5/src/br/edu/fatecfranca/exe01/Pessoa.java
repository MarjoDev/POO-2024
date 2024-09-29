package br.edu.fatecfranca.exe01;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor {

    @Override
    public void vota() {
        System.out.println("A pessoa está votando.");
    }

    @Override
    public String getRG() {
        return "RG da pessoa";
    }

    @Override
    public void pagaIR() {
        System.out.println("A pessoa está pagando imposto de renda.");
    }

    @Override
    public String getCPF() {
        return "CPF da pessoa";
    }

    @Override
    public void trabalha() {
        System.out.println("A pessoa está trabalhando.");
    }

    @Override
    public void ensina() {
        System.out.println("A pessoa está ensinando.");
    }
}
