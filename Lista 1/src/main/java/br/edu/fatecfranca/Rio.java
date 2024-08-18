package br.edu.fatecfranca;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(){
        this.nivel = 0;
        this.poluido = false;
        this.nome = "Não definido";
    }
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;

    }

    public void chover(float x) {
        this.nivel = this.nivel + x;
        System.out.println("Nível do rio aumentando, o está com o nível: " + this.nivel);
    }

    public void ensolarar(float x) {
        if ((this.nivel - x) > -1){
            this.nivel = this.nivel - x;
            System.out.println("Nível do rio diminuindo, o está com o nível: " + this.nivel);
        }
        else{
            System.out.println("O rio não pode abaixar abaixo de zero.");
        }
    }

    public void limpar(){
        if (this.poluido == true){
            this.poluido = false;
            System.out.println("O rio está limpo");
        }
        else{
            System.out.println("O rio ja está limpo");
        }
    }

    public void sujar(){
        if (!this.poluido == false){
            this.poluido = true;
            System.out.println("O rio foi sujo");
        }
        else{
            System.out.println("O rio ja está sujo");
        }
    }

    public void mostra(){
        System.out.println("O nome do rio é: " + this.nome + " e o nível do rio: " + this.nivel + " e o poluido: " + this.poluido);
    }
}
