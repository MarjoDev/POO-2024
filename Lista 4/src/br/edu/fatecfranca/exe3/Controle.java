package br.edu.fatecfranca.exe3;

public class Controle {
    public static void main(String[] args) {
        Produto produto = new Radio(1234, 50, 94.9, "FM");  // Exemplo de polimorfismo

        System.out.println("Antes do teste: " + produto.toString());

        // Testando o produto
        if (produto.testaUnidade()) {
            System.out.println("Produto aprovado!");
        } else {
            System.out.println("Produto reprovado!");
        }

        System.out.println("Após o teste: " + produto.toString());

        // Caso seja um Rádio, alterar valores
        if (produto instanceof Radio) {
            Radio radio = (Radio) produto;
            radio.trocaEstacao(101.1);
            radio.trocaBanda("AM");
            System.out.println("Após trocar estação e banda: " + radio.toString());
        }

        // Exemplo com TV
        Produto produtoTV = new TV(5678, 30, 5);
        System.out.println("Antes do teste: " + produtoTV.toString());

        // Testando o produto
        if (produtoTV.testaUnidade()) {
            System.out.println("Produto TV aprovado!");
        } else {
            System.out.println("Produto TV reprovado!");
        }

        System.out.println("Após o teste: " + produtoTV.toString());

        if (produtoTV instanceof TV) {
            TV tv = (TV) produtoTV;
            tv.trocaCanal(10);
            System.out.println("Após trocar o canal: " + tv.toString());
        }
    }
}
