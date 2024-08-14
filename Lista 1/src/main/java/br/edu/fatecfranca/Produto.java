package br.edu.fatecfranca;

public class Produto {
    public int id;
    public String descricao;
    public int qtde;
    public float preco;

    public Produto(){
        this.id = 0;
        this.descricao = "Não definido";
        this.qtde = 0;
        this.preco = 0;
    }

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int x){
        this.qtde = this.qtde + x;
    }

    public void vender(int x){
        this.qtde = this.qtde - x;
    }

    public void subir(float x){
        this.preco = this.preco + x;
    }

    public void descer(float x){
        this.preco = this.preco - x;
    }

    public void mostra(){
        System.out.println("ID do produto: " + this.id + "\nDescrição: " + this.descricao + "\nQuantidade: " + this.qtde + "\nPreco: " + this.preco);
    }
}
