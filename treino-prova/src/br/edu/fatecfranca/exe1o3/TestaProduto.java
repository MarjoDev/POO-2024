package br.edu.fatecfranca.exe1o3;

public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Peças", 10, 100);
        Produto produto2 = new Produto();

        produto.comprar(5);
        produto.vender(10);
        produto.subir(50);
        produto.descer(100);
        produto.mostra();

        produto2.comprar(5);
        produto2.vender(10);
        produto2.subir(50);
        produto2.descer(100);
        produto2.mostra();
    }
}
