package br.edu.fatecfranca.exe5;

public class Teste {
    public static void main(String[] args) {
        // Criar o cliente
        Cliente cliente = new Cliente("Maria Oliveira", 2000.00);

        // Criar a conta normal do cliente com um saldo inicial e limite
        Conta conta = new Conta(cliente, 12345, 1000.00, 500.00);

        // Criar o cartão com a conta e uma senha inicial
        Cartao cartao = new Cartao(conta, "senha123");

        // Testar saldo com a senha correta
        System.out.println("Saldo com senha correta: R$" + cartao.saldo("senha123"));

        // Testar retirada com a senha correta
        boolean retirada = cartao.retirada(500.00, "senha123");
        if (retirada) {
            System.out.println("Saldo após retirada: R$" + cartao.saldo("senha123"));
        } else {
            System.out.println("Retirada não permitida.");
        }

        // Testar alterar a senha
        boolean senhaAlterada = cartao.alterarSenha("senha123", "novaSenha456");
        if (senhaAlterada) {
            // Testar saldo com a nova senha
            System.out.println("Saldo com a nova senha: R$" + cartao.saldo("novaSenha456"));
        } else {
            System.out.println("Alteração de senha falhou.");
        }

        // Testar retirada com a nova senha
        retirada = cartao.retirada(200.00, "novaSenha456");
        if (retirada) {
            System.out.println("Saldo após nova retirada: R$" + cartao.saldo("novaSenha456"));
        } else {
            System.out.println("Retirada não permitida.");
        }
    }
}
