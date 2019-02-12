package ch2_operators;

import java.util.Random;

/**
 * Created by Vasiliy Kylik (Lightning) on 05.01.2019.
 */
public class E07_CoinFlipping {
    public static void main(String[] args) {
        Random rand = new Random(47);
        boolean flip = rand.nextBoolean();
        System.out.println("Outcome: ");
        System.out.println(flip ? "HEAD" : "TAIL");
    }
}
