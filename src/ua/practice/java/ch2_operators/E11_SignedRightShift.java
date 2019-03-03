package ch2_operators;

/**
 * Created by Vasiliy Kylik (Lightning) on 03.03.2019.
 */

import static util.Print.print;

/****************** Exercise 11 *****************
 * Start with a number that has a binary one in
 * the most significant position. (Hint: Use a
 * hexadecimal constant.) Use the signed
 * right-shift operator to right shift your
 * number through all its binary positions.
 * Display each result using Integer.toBinaryString().
 ************************************************/

public class E11_SignedRightShift {
    public static void main(String[] args) {
        int i = 0x80000000;
        print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
        i >>= 1; print(Integer.toBinaryString(i));
    }
}
