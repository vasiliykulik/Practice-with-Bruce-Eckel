package ch2_operators;

import static util.Print.print;

/**
 * @author Vasiliy Kylik on(Rocket) on 06.03.2019.
 */
public class StringOperators{
    public static void main(String[] args) {
        int x=0, y=1, z=2;
        String s = "x, y, z ";
        print(s + x + y + z);
        print(x + " " + s); // Converts x to a String
        s += "(summed) = "; // Concatenation operator
        print(s + (x + y + z));
        print(" " + x); // Shorthand for Integer.toString()

    }
}
/* Output:
x, y, z 012
0 x, y, z
x, y, z (summed) = 3
0
*/