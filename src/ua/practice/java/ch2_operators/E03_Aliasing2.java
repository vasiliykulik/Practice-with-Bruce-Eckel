package ch2_operators;

/**
 * Created by Vasiliy Kylik (Lightning) on 20.12.2018.
 */

import static util.Print.print;

/****************** Exercise 3 *****************
 * Create a class containing a float and use it
 * to demonstrate aliasing during method calls.
 ***********************************************/
public class E03_Aliasing2 {
    static void f(Integral y) {
        y.f = 1.0f;
    }

    public static void main(String[] args) {

        Integral x = new Integral();
        x.f = 2.0f;
        print("1: x.f: " + x.f);
        f(x);
        print("2: x.f: " + x.f);
    }
}
