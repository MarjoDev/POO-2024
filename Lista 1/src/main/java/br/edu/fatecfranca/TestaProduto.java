package br.edu.fatecfranca;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "teste", 10, 1000);
        Produto produto2 = new Produto();

        produto1.comprar(5);
        produto1.vender(8);
        produto1.subir(3000);
        produto1.descer(2000);
        produto1.mostra();

        produto2.comprar(5);
        produto2.vender(3);
        produto2.subir(3000);
        produto2.descer(2000);
        produto2.mostra();
    }
}
