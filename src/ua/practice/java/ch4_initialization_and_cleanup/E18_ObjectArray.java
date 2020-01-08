package ch4_initialization_and_cleanup;

/**
 * @author Vasiliy Kylik on(Arrow) on 08.01.2020.
 */

/****************** Exercise 18 *****************
 * Create objects to attach to the array of
 * references for Exercise 17.
 ************************************************/
public class E18_ObjectArray {
    public static void main(String args[]) {
        Test[] array = new Test[5];
        for(int i = 0; i < array.length; i++) {
            array[i] = new Test(Integer.toString(i));
        }
    }
}
/*
Integer.toString( ) returns a String object representing the specified integer.
Can you find a way to convert an integer into a String without using this utility
method?
*/