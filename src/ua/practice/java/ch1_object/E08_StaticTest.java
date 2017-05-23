package ch1_object;

/**
 * Created by Vasiliy Kylik on 23.05.2017.
 */
/****************** Exercise 8 ******************
 * Write a program to demonstrate that no
 * matter how many objects you create of a
 * particular class, there is only one instance
 * of a particular static field in that class.
 ************************************************/
public class E08_StaticTest {
  static int i = 47;

  public static void main(String[] args) {
    E08_StaticTest st1 = new E08_StaticTest();
    E08_StaticTest st2 = new E08_StaticTest();
    System.out.println(st1.i + " == " + st2.i);
    st1.i++;
    System.out.println(st1.i + " == " + st2.i);
  }
  /*The output shows that both instances of E08_StaticTest share the same static
field. We incremented the shared field through the first instance and the effect
was visible in the second instance.*/
}
