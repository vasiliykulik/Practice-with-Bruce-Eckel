package ch2_operators;

/**
 * Created by Vasiliy Kylik (Lightning) on 20.12.2018.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

/****************** Exercise 4 *****************
 * Write a program that calculates velocity
 * using a constant distance and a constant time.
 ***********************************************/
public class E04_Velocity {
    public static void main(String[] args) {
        if (args.length<2){
            System.err.println("Usage: java E04_Velocity distance time");
            System.exit(1);
        }
        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);
        System.out.print("Velocity = ");
        System.out.print(distance/time);
        System.out.println(" m/s");
    }
}
