package ch1_object.javadoc_e15;

/**
 * Created by Vasiliy Kylik on 24.05.2017.
 */
/****************** Exercise 15 *****************
 * Add comment documentation to the program in Exercise 2.
 * Extract it into an HTML file using Javadoc
 * and view it with your Web browser.
 ************************************************/
/** A first example from <i>sTIJ4</i>.
 * Demonstrates the basic class
 * structure and the creation of a
 * <code>main()</code> method.
 */
public class E15_HelloWorldDoc {
  /** The <code>main()</code> method which is
   called when the program is executed by saying
   <code>java E15_HelloWorldDoc</code>.
   @param args array passed from the command-line
   */
  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }
}
