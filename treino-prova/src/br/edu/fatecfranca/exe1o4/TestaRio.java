package br.edu.fatecfranca.exe1o4;

public class TestaRio {
    public static void main(String[] args) {
        Rio rio = new Rio("Rio Grande", 10, true);
        Rio rio2 = new Rio();

        rio.chover(10);
        rio.ensolarar(15);
        rio.limpar();
        rio.sujar();
        rio.mostra();

        rio2.chover(10);
        rio2.ensolarar(15);
        rio2.limpar();
        rio2.sujar();
        rio2.mostra();
    }
}
