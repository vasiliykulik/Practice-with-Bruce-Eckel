package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.06.2019.
 */
public class E04_OverloadedConstructor {
    E04_OverloadedConstructor() {
        System.out.println("Default constructor");
    }
    E04_OverloadedConstructor(String s) {
        System.out.println("String arg constructor");
        System.out.println(s);
    }
    public static void main(String args[]) {
// Call default version:
        new E04_OverloadedConstructor();
// Call overloaded version:
        new E04_OverloadedConstructor("Overloaded");
    }
}
