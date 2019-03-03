package ch2_operators;

/**
 * Created by Vasiliy Kylik (Lightning) on 03.03.2019.
 */

import static util.Print.print;

/****************** Exercise 12 *****************
 * Start with a number that is all binary ones.
 * Left shift it, then use the unsigned right-shift
 * operator to right shift through all of its binary
 * positions. Display each result using
 * Integer.toBinaryString().
 ************************************************/
public class E12_UnsignedRightShift {
    public static void main(String[] args) {

        print(Integer.toBinaryString(-1));
        int i = -1 << 1;
        print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
        i >>>= 1; print(Integer.toBinaryString(i));
    }
}
