package ua.practice.object;

/**
 * Created by Vasiliy Kylik on 23.05.2017.
 */

/****************** Exercise 1 *****************
 * Create a class containing an int and a char
 * that are not initialized. Print their values
 * to verify that Java performs default
 * initialization.
 ***********************************************/
public class E01_DefaultInitialization {
  int i;
  char c;

  public E01_DefaultInitialization() {
    System.out.println("i = " + i);
    System.out.println("c = [" + c + ']');
  }

  public static void main(String[] args) {
    new E01_DefaultInitialization();
  }
}
