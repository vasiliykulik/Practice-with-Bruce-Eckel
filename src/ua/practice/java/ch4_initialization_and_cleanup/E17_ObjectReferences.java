package ch4_initialization_and_cleanup;

/**
 * @author Vasiliy Kylik on(Arrow) on 08.01.2020.
 */

/****************** Exercise 17 *****************
 * Create a class with a constructor that takes
 * a String argument. During construction, print
 * the argument. Create an array of object
 * references to this class, but don't
 * create objects to assign into the
 * array. When you run the program, notice
 * whether the initialization messages from the
 * constructor calls are printed.
 ************************************************/

class Test{
    Test(String s) {
        System.out.println("String constructor; s = "+s);
    }
}
public class E17_ObjectReferences {
    // You can define the array as a field in the class:
    Test[] array1  = new Test[5];

    public static void main(String[] args) {
        // Or as a temporary inside main:
        Test[] array = new Test[5];
    }
}
/*
This code creates only the array, not the objects that go into it. You don’t see
initialization messages in Test’s constructors because no instances of that class
exist.
*/
