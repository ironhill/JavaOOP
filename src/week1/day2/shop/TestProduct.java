package week1.day2.shop;

/**
 * Created by Ihor Samanchuk on 20.09.2015.
 */
public class TestProduct {
    public static void main(String[] args) {
        Product prodNew = new Product();
        prodNew.name="Snickers";
        prodNew.price=15.45;
        prodNew.id=1;
        System.out.println(prodNew.toString());

        Seller[] sellersArray = new Seller[5];
        int sellersCounter = 0;

        Seller seller1 = new Seller("Galya", "Parasyuk", 1);
        seller1.sellerInfo();
        sellersArray[0] = seller1;
    }
}
