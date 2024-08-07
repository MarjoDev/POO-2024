//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package br.edu.fatecfranca;

public class Carro {
    public String marca;
    public String modelo;
    public String cor;
    public int ano;

    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("Acelerando..." + this.marca + " " + this.modelo);
    }

    public void frear() {
        System.out.println("Freando..." + this.marca + " " + this.modelo);
    }
}
