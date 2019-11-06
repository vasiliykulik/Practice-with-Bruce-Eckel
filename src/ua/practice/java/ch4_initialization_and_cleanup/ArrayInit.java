package ch4_initialization_and_cleanup;

import java.util.Arrays;

/**
 * @author Vasiliy Kylik on(Rocket) on 06.11.2019.
 */
public class ArrayInit {
    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                3, // Autoboxing
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                3, // Autoboxing
        };
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}