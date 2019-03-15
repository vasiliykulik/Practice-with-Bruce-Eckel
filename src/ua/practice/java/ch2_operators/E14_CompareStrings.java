package ch2_operators;

/**
 * Created by Vasiliy Kylik (Lightning) on 15.03.2019.
 */

/****************** Exercise 14 *****************
 * Write a method that compares two String arguments
 * using all the Boolean comparisons and print the
 * results. Perform the equals() test for the == and
 * !=. In main(), call your method with different
 * String objects.
 ************************************************/
public class E14_CompareStrings {
    public static void p(String s, boolean b) {
        System.out.println(s + ": " + b);
    }

    public static void compare(String lval, String rval) {
        System.out.println("lval: " + lval + " rval: " + rval);
        //! p("lval < rval: " + lval < rval);
        //! p("lval > rval: " + lval > rval);Thinking in Java, 4 34 th Edition Annotated Solution Guide
        //! p("lval <= rval: " + lval <= rval);
        //! p("lval >= rval: " + lval >= rval);
        p("lval == rval", lval == rval);
        p("lval != rval", lval != rval);
        p("lval.equals(rval)", lval.equals(rval));
    }

    public static void main(String[] args) {
        compare("Hello", "Hello");
        // Force creation of separate object:
        String s = new String("Hello");
        compare("Hello", s);
        compare("Hello", "Goodbye");
    }

}
