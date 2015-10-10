package week3.homework.trainkassa;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Ironhill on 08.10.2015.
 */
public class Train {
    private int trainNumber = Ticket.trainNumber;
    private Date dateDispatch = Ticket.dateDispatch;
    private int carriagesAmount;
    private ArrayList trainArray ;

    public Train(int carriagesAmount) {
        this.carriagesAmount = carriagesAmount;
        this.trainArray = new ArrayList(carriagesAmount);
    }

    public void addPlats(int amountCarriages, PlatscardCarriage plats){
        for (int i = 0; i < amountCarriages; i++) {
            trainArray.add(i, plats);
        }
    }
    public void addCupe(int amountCarriages, CupeCarriage cupe){
        for (int i = 0; i < amountCarriages; i++) {
            trainArray.add(i, cupe);
        }
    }
}
