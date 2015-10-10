package week3.homework.trainkassa;

/**
 * Created by Ironhill on 08.10.2015.
 */
public class Carriage {
    private int placesAmount;
    private boolean[] arrayPlaces;
    private float price;

    public Carriage(int placesAmount, float price) {
        this.placesAmount = placesAmount;
        this.price = price;
    }

    public void setCarrige(){
        this.arrayPlaces = new boolean[this.placesAmount];
    }

    public int getPlacesAmount() {
        return placesAmount;
    }

    public boolean checkPlace(int PlaceNumber){
        return arrayPlaces[PlaceNumber];
    }
}
