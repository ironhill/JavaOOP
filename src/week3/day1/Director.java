package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ihor Samanchuk on 04.10.2015.
 */
public class Director extends Emploee {
    private ArrayList<Emploee> arrayList = new ArrayList<Emploee>();

    public void addEmployee(Emploee employer){
        arrayList.add(employer);
    }

    public Emploee getEmployee(int cellNum){
        return arrayList.get(cellNum);
    }

    public void makekipish(){
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).emploeerWorks();
        }
    }

    public String getAll(){
        Emploee[] mas = (Emploee[]) arrayList.toArray();
        return Arrays.toString(mas);
    }
}

