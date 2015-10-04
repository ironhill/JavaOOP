package week1.day2.shop;

/**
 * Created by Ihor Samanchuk on 20.09.2015.
 */
public class Seller {
    private String SellerName;
    private String SellerSureName;
    private int SellerId;
    private int prductCounter = 0;

    Product[] productArray = new Product[30];

    public Seller(String sellerName, String sellerSureName, int sellerId) {
        this.SellerName = sellerName;
        this.SellerSureName = sellerSureName;
        this.SellerId = sellerId;
    }

    public void setSellerName(String sellerName) {
        this.SellerName = sellerName;
    }

    public void setSellerSureName(String sellerSureName) {
        this.SellerSureName = sellerSureName;
    }

    public void setSellerId(int sellerId) {
        this.SellerId = sellerId;
    }

    public String getSellerName() {
        return SellerName;
    }

    public String getSellerSureName() {
        return SellerSureName;
    }

    public int getSellerId() {
        return SellerId;
    }

    public void sellerInfo() {
        System.out.printf("Seller Name: %s, Seller Surename: %s, Seller ID: %d \n ", SellerName, SellerSureName, SellerId);
    }

    public void addProduct(Product product) {
        productArray[prductCounter] = product;
        prductCounter++;
    }

    //public void
}
