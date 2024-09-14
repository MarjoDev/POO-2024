package br.edu.fatecfranca.exe1;

public class Programa {
    public static void main(String[] args) {
        Palco palco = new Palco();
        palco.atuar();
        palco.altera();
        palco.atuar();
    }
}
/* Resposta exercicío 1
    O programa utiliza os conceitos de herança, polimorfismo, encapsulamento e abstração
    para que as classes AtorFeliz e AtorTriste implementem o método abstrato ato() da classe Ator.
    No método main, o objeto ator inicialmente é uma instância de AtorFeliz, que imprime "Ator feliz".
    Após chamar o método altera(), o objeto ator é alterado para AtorTriste, e a segunda chamada imprime "Ator triste".
    O programa também demonstra encapsulamento ao ocultar a lógica de alteração de estado dentro da classe Palco.
*/