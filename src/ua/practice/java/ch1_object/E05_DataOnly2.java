package ch1_object;

/**
 * Created by Vasiliy Kylik on 23.05.2017.
 */
/****************** Exercise 5 ******************
 * Modify Exercise 4 so the values
 * of the data in DataOnly are assigned to and
 * printed in main().
 ************************************************/
public class E05_DataOnly2 {
  int i;
  double d;
  boolean b;

  public static void main(String[] args) {
    E05_DataOnly2 d = new E05_DataOnly2();
    d.i = 47;
    System.out.println("d.j = " + d.i);
    d.d = 1.1;
    System.out.println("d.d = " + d.d);
    d.b = false;
    System.out.println("d.b = " + d.b);
  }
}
