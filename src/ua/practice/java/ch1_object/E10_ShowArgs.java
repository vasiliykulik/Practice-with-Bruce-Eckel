package ch1_object;

/**
 * Created by Vasiliy Kylik on 23.05.2017.
 */

/****************** Exercise 10 ****************
 * * Write a program that prints three arguments
 * taken from the command line.
 * You'll need to index into the command-line
 * array of Strings.
 ***********************************************/

public class E10_ShowArgs {
  public static void main(String[] args) {
    if (args.length < 3) {
      System.err.println("Need 3 arguments");
      System.exit(1);
    }
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]);
  }
  /*Remember, when you want to get an argument from the command line:
• Arguments are provided in a String array.
• args[0] is the first command-line argument and not the name of the
program (as it is in C).
• You’ll cause a runtime exception if you run the program without enough
arguments.*/
  /*System.exit( ) terminates the program and passes its argument back to the
operating system as a status code. (With most operating systems, a non-zero
status code indicates that the program execution failed.) Typically, you send
error messages to System.err, as shown above.*/
}
