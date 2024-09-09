import br.edu.fatecfranca.Assistente;
import br.edu.fatecfranca.Funcionario;
import br.edu.fatecfranca.Gerente;
import br.edu.fatecfranca.Diretor;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void folhaPagamento(List<Funcionario> funcionarios) {
        double totalSalarios = 0;

        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.calcularSalario();
        }

        System.out.println("Total da folha de pagamento: R$ " + Math.round(totalSalarios * 100.0) / 100.0);
    }

    public static void polimorfismo(Funcionario funcionario) {
        System.out.println(funcionario.toString());
    }
    public static void main(String[] args) {
        Assistente ass1 =
                new Assistente("Jamelão", "Borda observavel do universo", "666-666-666-66", 10000, 10);
        polimorfismo(ass1);

        Gerente ger1 =
                new Gerente("Porra", "Perto da calçada", "000-000-000-00", 20000, 5000);
        polimorfismo(ger1);

        Diretor dir1 =
                new Diretor("Skate", "Borda observavel do universo", "666-000-666-00", 50000, 8000);
        polimorfismo(dir1);

        List<Funcionario> funcs = new ArrayList<Funcionario>();
        funcs.add(ass1);
        funcs.add(ger1);
        funcs.add(dir1);

        folhaPagamento(funcs);
    }
}