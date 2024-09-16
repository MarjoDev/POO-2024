package br.edu.fatecfranca.exe4o2;

public class Programa {
    public static void main(String[] args) {
        CartaoWeb[] cartoes = new CartaoWeb[3];

        cartoes[0] = new DiaDosNamorados("Maria");
        cartoes[1] = new Natal("João");
        cartoes[2] = new Aniversario("Ana");

        for (CartaoWeb cartao : cartoes) {
            cartao.showMessage();
        }
    }
}
