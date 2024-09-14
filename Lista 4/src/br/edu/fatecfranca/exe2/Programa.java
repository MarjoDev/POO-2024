package br.edu.fatecfranca.exe2;

// Classe principal com o método main
public class Programa {
    public static void main(String[] args) {
        // Criando um array de CartaoWeb
        CartaoWeb[] cartoes = new CartaoWeb[3];

        // Inserindo instâncias dos três tipos de cartões no array
        cartoes[0] = new DiaDosNamorados("Maria");
        cartoes[1] = new Natal("João");
        cartoes[2] = new Aniversario("Ana");

        // Utilizando um laço for para chamar o método showMessage() de cada cartão
        for (CartaoWeb cartao : cartoes) {
            cartao.showMessage();
        }
    }
}

/* Resposta exercício 2
 O polimorfismo acontece no seguinte trecho de código:
 for (CartaoWeb cartao : cartoes) {
     cartao.showMessage();
 Aqui, o método showMessage() é chamado em cada objeto de CartaoWeb,
 mas a implementação específica de cada classe filha (DiaDosNamorados, Natal, Aniversario) é executada.
 Isso é possível porque o Java resolve em tempo de execução qual implementação do método deve ser chamada,
 baseado no tipo real do objeto referenciado pela variável cartao
*/