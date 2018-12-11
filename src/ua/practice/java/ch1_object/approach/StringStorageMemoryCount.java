package ch1_object.approach;

/**
 * @author Vasiliy Kylik on(Rocket) on 11.12.2018.
 */
public class StringStorageMemoryCount {
    public static void main(String[] args) {
        System.out.println(storage("Hello"));
    }

    private static int storage(String s) {
        return s.length() * 2;
    }
}
