package br.edu.fatecfranca.exe0;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private double price;
    private String adress;
    private String payment;
    private List<CarItem> carItem;

    public ShoppingCart() {
        this.id = 0;
        this.price = 0.0;
        this.adress = "";
        this.payment = "";
        this.carItem = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, double price, String adress, String payment, List<CarItem> carItem) {
        this.id = id;
        this.price = price;
        this.adress = adress;
        this.payment = payment;
        this.carItem = carItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public List<CarItem> getCarItem() {
        return carItem;
    }

    public void setCarItem(List<CarItem> carItem) {
        this.carItem = carItem;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", price=" + price +
                ", adress='" + adress + '\'' +
                ", payment='" + payment + '\'' +
                ", carItem=" + carItem +
                '}';
    }
}
