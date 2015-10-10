package week3.homework.trainkassa;

import java.util.Date;

/**
 * Created by Ironhill on 08.10.2015.
 */
public  class Ticket {
    public static String dispatchPoint = null;
    public static String destinationPoint = null;
    public static Date dateDispatch = null;
    public static int trainNumber = 0;
    private int carriageNumber;
    private int placeNumber;
    private float price;

    public Ticket(String dispatchPoint, String destinationPoint, Date dateDispatch, int trainNumber, int carrigeNumber, int placeNumber, float price) {
        this.dispatchPoint = dispatchPoint;
        this.destinationPoint = destinationPoint;
        this.dateDispatch = dateDispatch;
        this.trainNumber = trainNumber;
        this.carriageNumber = carrigeNumber;
        this.placeNumber = placeNumber;
        this.price = price;
    }

}