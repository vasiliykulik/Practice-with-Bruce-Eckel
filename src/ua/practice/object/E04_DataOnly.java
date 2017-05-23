package ua.practice.object;

/**
 * Created by Vasiliy Kylik on 23.05.2017.
 */

/****************** Exercise 4 ******************
 * Turn the DataOnly code fragments into a
 * program that compiles and runs.
 Everything is an Object 11
 ************************************************/
public class E04_DataOnly {
  int i;
  double d;
  boolean b;

  public static void main(String[] args) {
    E04_DataOnly d = new E04_DataOnly();
    d.i = 47;
    d.d = 1.1;
    d.b = false;
    System.out.println(d.d);
  }
}
