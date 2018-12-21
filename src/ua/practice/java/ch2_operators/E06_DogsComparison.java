package ch2_operators;
import static util.Print.print;

/**
 * Created by Vasiliy Kylik (Lightning) on 21.12.2018.
 */
/****************** Exercise 6 *****************
 * Following Exercise 5 assign, a new Dog
 * reference to spot's object. Test for comparison
 * using == and equals() for all references.
 ***********************************************/
public class E06_DogsComparison {
    static void compare(Dog dog1, Dog dog2){
        print("== on top references: " + (dog1==dog2));
        print("equals() on top references")
    }
}
