package br.edu.fatecfranca.exe1o3;

public class Produto {
    public int id;
    public String descricao;
    public int qtde;
    public float preco;

    public Produto(){
        this.id = 0;
        this.descricao = "";
        this.qtde = 0;
        this.preco = 0;
    }
    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int valor){
        qtde += valor;
        System.out.println("Compra realizada com sucesso!");
    }

    public void vender(int valor){
        if(qtde >= valor){
            qtde -= valor;
            System.out.println("Venda realizada com sucesso!");
        }
        else{
            System.out.println("Estoque insuficiente!");
        }
    }

    public void subir(float valor){
        preco += valor;
        System.out.println("Preço aumentado com sucesso!");
    }

    public void descer(float valor){
        if (preco >= valor){
            preco -= valor;
            System.out.println("Preço abaixado com sucesso!");
        }
        else{
            System.out.println("Preço não pode ser abaixado de zero!");
        }
    }

    public void mostra(){
        System.out.println(
                "ID: " + id +
                "\nDescrição: " + descricao +
                "\nQuantidade: " + qtde +
                "\nPreço: " + preco
        );
    }
}
