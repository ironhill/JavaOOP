package week4;

import week2.day2.model.Human;

/**
 * Created by Ihor Samanchuk on 10.10.2015.
 */
public class Airplain extends Machine {

    private String type;
    private Human pilot;
    public Airplain(){
        super(1500,"An-140", 5000000);
    }

    //implement => override abstarct maethod
    @Override
    public void go(){
        System.out.println("Airplain" + toString() + "is flying");
    }
}
