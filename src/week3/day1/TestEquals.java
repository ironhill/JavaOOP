package week3.day1;

import week3.Coder;

/**
 * Created by Ihor Samanchuk on 04.10.2015.
 */
public class TestEquals {
    public static void main(String[] args) {

        Coder coder1 = new Coder("Ivan", 23, 33.55, "Java");
        Coder coder2 = new Coder("Petro", 23, 39.55, "JavaSE");
        Coder coder3 = new Coder("Kostya", 23, 38.55, "JavaEE");

        System.out.println("coder1 == coder2:  " + coder1.equals(coder3));

        //rflect - a.equals(a) => true
        //symet - a.equal(b) = b.qeuals()
        //trabs
    }
}
