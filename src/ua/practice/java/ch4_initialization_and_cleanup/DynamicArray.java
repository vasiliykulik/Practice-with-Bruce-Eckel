package ch4_initialization_and_cleanup;

/**
 * @author Vasiliy Kylik on(Rocket) on 06.11.2019.
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[]{ "fiddle", "de", "dum" });
    }
}
class Other {
    public static void main(String[] args) {
        for(String s : args)
            System.out.print(s + " ");
    }
}