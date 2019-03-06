package ch2_operators;

/**
 * @author Vasiliy Kylik on(Rocket) on 06.03.2019.
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long)i;
        System.out.println(i);
        System.out.println(lng);
        lng = i; // "Widening," so cast not really required
        long lng2 = (long)200;
        lng2 = 200;
        // A "narrowing conversion":
        i = (int)lng2; // Cast required
    }
}
