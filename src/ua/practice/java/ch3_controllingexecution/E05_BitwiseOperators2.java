package ch3_controllingexecution;

import static util.Print.print;
import static util.Print.printnb;

/**
 * Created by Vasiliy Kylik (Lightning) on 06.05.2019.
 */

/****************** Exercise 5 ******************
 * Repeat Exercise 10 from the previous chapter,
 * but use the ternary operator and a bitwise test
 * instead of Integer.toBinaryString() to display
 * the ones and zeroes.
 ************************************************/
public class E05_BitwiseOperators2 {
    private static void toBinaryString(int i) {
        char[] buffer = new char[32];
        int bufferPosition = 32;
        do {
            buffer[--bufferPosition] = ((i & 0x01) != 0) ? '1' : '0';
            i >>>= 1;
        }
        while (i != 0);
        for (int j = bufferPosition; j < 32; j++) {
            printnb(buffer[j]);
        }
        print();
    }

    public static void main(String[] args) {
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;
        printnb("i1 = ");
        toBinaryString(i1);
        printnb("i2 = ");
        toBinaryString(i2);
        printnb("~i1 = ");
        toBinaryString(~i1);
        printnb("~i2 = ");
        toBinaryString(~i2);
        printnb("i1 & i1 = ");
        toBinaryString(i1 & i1);
        printnb("i1 | i1 = ");
        toBinaryString(i1 | i1);
        printnb("i1 ^ i1 = ");
        toBinaryString(i1 ^ i1);
        printnb("i1 & i2 = ");
        toBinaryString(i1 & i2);
        printnb("i1 | i2 = ");
        toBinaryString(i1 | i2);
        printnb("i1 ^ i2 = ");
        toBinaryString(i1 ^ i2);
    }
}
/*The private static method toBinaryString( ) behaves like
Integer.toBinaryString( ), using buffer to hold the binary digits because
printing out the digits as encountered would produce an inverted output.*/