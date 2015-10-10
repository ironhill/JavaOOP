package week3;

/**
 * Created by Ihor Samanchuk on 03.10.2015.
 */
public class Manager extends Emploee {

    private Emploee[] emploee;
    private int emploeeCount;

    public Manager() {
        emploee = new Emploee[5];
    }

    public void addemploee(Coder coder) {
        emploee[emploeeCount++] = coder;
    }
    
    public void doTeamWork() {
        for (int i = 0; i < emploeeCount; i++) {
            this.emploee[i].emploeerWorks();
        }
    }
}
