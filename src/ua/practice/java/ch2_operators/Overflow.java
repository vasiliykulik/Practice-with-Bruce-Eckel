package ch2_operators;

/**
 * Created by Vasiliy Kylik (Lightning) on 15.03.2019.
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = " + big);
        int bigger = big *4;
        System.out.println("bigger = " + bigger);
    }
}
