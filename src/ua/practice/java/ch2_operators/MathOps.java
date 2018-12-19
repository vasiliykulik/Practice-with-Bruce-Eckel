package ch2_operators;

import static util.Print.print;

import java.util.Random;

/**
 * Created by Vasiliy Kylik (Lightning) on 20.12.2018.
 */
public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47); // 47 is seed for testing
        int i, k, j;
        j = rand.nextInt(100) + 1;
        // The lower bound is zero, which we don’t want because of the possibility of
        // a divide-by-zero, so the result is offset by one.
        print("j : " + j);
        k = rand.nextInt(100) + 1;
        print("k : " + k);
        i = j + k;
        print("j + k : " + i);
        i = j - k;
        print("j - k : " + i);
        i = j / k;
        print("j / k : " + i);
        i = j * k;
        print("j * k : " + i);
        i = j % k;
        print("j % k : " + i);

        float u, v, w;
        v = rand.nextFloat();
        print("v : " + v);
        w = rand.nextFloat();
        print("w : " + w);
        u = v + w;
        print("v + w : " + u);
        u = v - w;
        print("v / w : " + u);
        u = v * w;
        print("v - w : " + u);
        u = v / w;
// The following also works for char,
// byte, short, int, long, and double:
        u += v;
        print("u += v : " + u);
        u -= v;
        print("u -= v : " + u);
        u *= v;
        print("u *= v : " + u);
        u /= v;
        print("u /= v : " + u);

    }
}
