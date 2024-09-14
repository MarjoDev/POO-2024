package br.edu.fatecfranca.exe4;

import java.util.Random;

public class Jogo {

    public static void main(String[] args) {
        Random random = new Random();

        while (true) {
            Coisa c1 = criaAleatorio(random);
            Coisa c2 = criaAleatorio(random);

            System.out.println("Jogador 1 escolheu: " + c1);
            System.out.println("Jogador 2 escolheu: " + c2);

            if (c1.vence(c2)) {
                System.out.println("Jogador 1 vence com " + c1 + "!");
            } else if (c2.vence(c1)) {
                System.out.println("Jogador 2 vence com " + c2 + "!");
            } else {
                System.out.println("Empate!");
            }

            System.out.println("--------------------------------");
            try {
                Thread.sleep(2000); // Pausa de 2 segundos entre os jogos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static Coisa criaAleatorio(Random random) {
        int escolha = random.nextInt(3); // Gera um número aleatório entre 0 e 2
        switch (escolha) {
            case 0:
                return new Pedra();
            case 1:
                return new Papel();
            case 2:
                return new Tesoura();
            default:
                throw new IllegalStateException("Escolha inválida: " + escolha);
        }
    }
}
