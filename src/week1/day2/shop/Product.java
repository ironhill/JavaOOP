package week1.day2.shop;

/**
 * Created by Ihor Samanchuk on 20.09.2015.
 */
public class Product {

    String name;
    int id;
    double price;

    public String toString() {
        return "id: " + id + " Name: " + name + " Price: " + price;
    }

    public void addProduct(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
