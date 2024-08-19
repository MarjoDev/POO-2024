import br.edu.fatecfranca.exe0.Aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Jão", 123, 8);

        Aluno obj2 = new Aluno();
        obj2.setNome("Fei");
        obj2.setRa(123);
        obj2.setMedia(7);

        System.out.println("RA: " + obj2.getRa());

        Aluno obj3 = new Aluno();
        obj3.setNome("Pelé");
        obj3.setRa(1234);
        obj3.setMedia(32);

        System.out.println("RA: " + obj3.getRa());
    }
}