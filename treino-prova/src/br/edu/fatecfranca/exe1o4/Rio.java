package br.edu.fatecfranca.exe1o4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(){
        this.nome = "";
        this.nivel = 0;
        this.poluido = false;
    }
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float valor){
        this.nivel += valor;
        System.out.println("Nível do rio aumentado com sucesso!");
    }

    public void ensolarar(float valor){
        if (this.nivel >= valor){
            this.nivel -= valor;
            System.out.println("Nível do rio abaixado com sucesso!");
        }
        else{
            System.out.println("O nível não pode ficar abaixo de 0!");
        }
    }

    public void limpar(){
        if (this.poluido){
            this.poluido = false;
            System.out.println("Rio limpo com sucesso!");
        }
        else{
            System.out.println("O rio já está limpo!");
        }
    }

    public void sujar(){
        if (!this.poluido){
            this.poluido = true;
            System.out.println("Rio sujo com sucesso!");
        }
        else{
            System.out.println("O rio já está sujo!");
        }
    }

    public void mostra(){
        System.out.println(
                "Nome do rio: " + this.nome +
                "\nNível do rio: " + this.nivel +
                "\nPoluido: " + this.poluido
        );
    }
}
