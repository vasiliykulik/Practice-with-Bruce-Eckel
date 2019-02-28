package ch2_operators;

/****************** Exercise 9 *****************
 * Display the largest and smallest numbers for
 * both float and double exponential notation.
 ***********************************************/

import static util.Print.print;

/**
 * Created by Vasiliy Kylik (Lightning) on 28.02.2019.
 */
public class E09_MinMaxExponents {
    public static void main(String[] args) {
        print("Float MIN: " + Float.MIN_VALUE);
        print("Float MAX: " + Float.MAX_VALUE);
        print("Double MIN: " + Double.MIN_VALUE);
        print("Double MAX: " + Double.MAX_VALUE);
    }
}
