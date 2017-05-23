package ch1_object;

/**
 * Created by Vasiliy Kylik on 23.05.2017.
 */

/****************** Exercise 6 ******************
 * Write a program that includes and calls the
 * storage() method defined as a code fragment in
 * this chapter.
 ************************************************/
public class E06_Storage {
  String s = "Hello, World!";

  int storage(String s) {
    return s.length() * 2;
  }

  void print() {
    System.out.println("storage(s) = " + storage(s));
  }

  public static void main(String[] args) {
    E06_Storage st = new E06_Storage();
    st.print();
  }

}
