package ch2_operators;

/**
 * Created by Vasiliy Kylik on 24.05.2017.
 */

import java.util.Date;

import static util.Print.print;

/****************** Exercise 1 *****************
 * Write a program that uses the "short" and
 * normal form of print statement.
 ***********************************************/
public class E01_PrintStatements {
  public static void main(String[] args) {
    Date currDate = new Date();
    System.out.println("Hello, it's: " + currDate);
    print("Hello, it's: " + currDate);
  }
}
