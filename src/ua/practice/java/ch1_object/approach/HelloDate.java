package ch1_object.approach;

//: object/HelloDate.java
import java.util.Date;

/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 * @author Vasiliy Kylik on(Rocket) on 11.12.2018.
 */
public class HelloDate {
    /** Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
    }
}
/* Output:
Hello, it's:
Sat Dec 15 19:25:28 EET 2018
*///:~