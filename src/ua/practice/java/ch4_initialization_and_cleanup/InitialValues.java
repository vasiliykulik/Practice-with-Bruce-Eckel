package ch4_initialization_and_cleanup;

import static util.Print.print;

/**
 * Created by Vasiliy Kylik (Lightning) on 03.07.2019.
 */
public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitialValues() {
        print("Data type Initial value");
        print("boolean " + t);
        print("char [" + c + "]");
        print("byte " + b);
        print("short " + s);
        print("int " + i);
        print("long " + l);
        print("float " + f);
        print("double " + d);
        print("reference " + reference);
    }
    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
/* You could also say:
new InitialValues().printInitialValues();
*/
    }

    /*You can see that even though the values are not specified, they automatically get initialized
(the char value is a zero, which prints as a space). So at least there’s no threat of working
with uninitialized variables.
When you define an object reference inside a class without initializing it to a new object, that
reference is given a special value of null.*/
}
