package ch2_operators;
/****************** Exercise 8 *****************
 * Show that hex and octal notations work with long
 * values. Use Long.toBinaryString() to display
 * the results.
 ***********************************************/

import static util.Print.print;

/**
 * Created by Vasiliy Kylik (Lightning) on 12.02.2019.
 */
public class E08_LongLiterals {
    public static void main(String[] args) {
        long l1 = 0x2f; // Hexadecimal (lowercase)
        print("l1: " + Long.toBinaryString(l1));
        long l2 = 0X2F; // Hexadecimal (uppercase)
        print("l2: " + Long.toBinaryString(l2));
        long l3 = 0177; // Octal (leading zero)
        print("l3: " + Long.toBinaryString(l3));
    }
}
// Note that Long.toBinaryString( ) does not print leading zeroes