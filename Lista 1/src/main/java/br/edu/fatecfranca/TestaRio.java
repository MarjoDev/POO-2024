package br.edu.fatecfranca;

public class TestaRio {
    public static void main(String[] args) {
        Rio rio = new Rio("Tapejara", 0, false);
        Rio rio2 = new Rio();

        rio.chover(5);
        rio2.chover(5);

        rio.ensolarar(3);
        rio2.ensolarar(3);

        rio.limpar();
        rio2.limpar();

        rio.limpar();
        rio2.limpar();

        rio.sujar();
        rio2.sujar();

        rio.mostra();
        rio2.mostra();
    }
}
