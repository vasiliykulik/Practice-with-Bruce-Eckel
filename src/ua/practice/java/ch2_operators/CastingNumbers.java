package ch2_operators;

import static util.Print.print;

/**
 * @author Vasiliy Kylik on(Rocket) on 06.03.2019.
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above =0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        print("(int)above " + (int)above);
        print("(int)below " + (int)below);
        print("(int)fabove " + (int)fabove);
        print("(int)fbelow " + (int)fbelow);
    }
}
