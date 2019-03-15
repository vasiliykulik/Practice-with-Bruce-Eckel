package ch2_operators;

import static util.Print.print;

/**
 * Created by Vasiliy Kylik (Lightning) on 03.03.2019.
 */
/****************** Exercise 13 *****************
 * Write a method to display char values in
 * binary form. Demonstrate it using several
 * different characters.
 ************************************************/
public class E13_BinaryChar {
    public static void main(String[] args) {
        print("A: " + Integer.toBinaryString('A'));
        print("!: " + Integer.toBinaryString('!'));
        print("x: " + Integer.toBinaryString('x'));
        print("7: " + Integer.toBinaryString('7'));
    }
}
