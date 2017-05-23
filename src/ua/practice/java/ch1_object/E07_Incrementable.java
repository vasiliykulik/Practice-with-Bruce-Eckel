package ch1_object;

/**
 * Created by Vasiliy Kylik on 23.05.2017.
 */

/****************** Exercise 7 ******************
 * Turn the Incrementable code fragments into a
 * working program.
 ************************************************/
class StaticTest {
  static int i = 47;
}

public class E07_Incrementable {
  static void increment() {
    StaticTest.i++;
  }

  public static void main(String[] args) {
    E07_Incrementable sf = new E07_Incrementable();
    sf.increment();
    E07_Incrementable.increment();
    increment();
  }
  /*You can call increment( ) by itself, because a static method (main( ), in this
case) can call another static method without qualification.*/

}
