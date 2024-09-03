import br.edu.fatecfranca.Assistente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Assistente ass1 =
                new Assistente("Jamelão", "Borda observavel do universo", "666-666-666-66", 10000, 10);

        System.out.println(ass1);
        System.out.println(ass1.calcularSalario());
    }
}