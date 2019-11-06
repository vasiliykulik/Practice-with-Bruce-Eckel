package ch4_initialization_and_cleanup;

import java.util.Arrays;
import java.util.Random;

import static util.Print.print;

/**
 * @author Vasiliy Kylik on(Rocket) on 06.11.2019.
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        print("length of a = " + a.length);
        for(int i = 0; i < a.length; i++)
            a[i] = rand.nextInt(500); // Autoboxing
        print(Arrays.toString(a));
    }
}