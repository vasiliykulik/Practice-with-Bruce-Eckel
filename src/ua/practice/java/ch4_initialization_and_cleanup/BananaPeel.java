package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.06.2019.
 */

class Banana{
    void peel(int i){
        System.out.println(i);
    }
}
public class BananaPeel {
    public static void main(String[] args){
        Banana a = new Banana(), b = new Banana();
        a.peel(1);
        b.peel(2);
    }
}
