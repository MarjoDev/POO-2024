import br.edu.fatecfranca.exe0.CarItem;
import br.edu.fatecfranca.exe0.Product;

public class Main {
    public static void main(String[] args) {

        Product obj1 = new Product(1, "Monitor", 600);
        Product obj3 = new Product(2, "Teclado", 140);
        Product obj5 = new Product(3, "Mouse", 90);

        CarItem obj2 = new CarItem(1, 5, obj1);
        CarItem obj4 = new CarItem(2, 6, obj1);
        CarItem obj6 = new CarItem(3, 10, obj3);
        CarItem obj7 = new CarItem(4, 15, obj3);
        CarItem obj8 = new CarItem(5, 20, obj5);

        System.out.println(obj2);
        System.out.println(obj4);
        System.out.println(obj6);
        System.out.println(obj7);
        System.out.println(obj8);

    }
}