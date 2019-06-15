package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.06.2019.
 */
/****************** Exercise 3 ******************
 * Create a class with a default constructor (one
 * that takes no arguments) that prints a
 * message. Create an object of this class.
 ************************************************/

public class E03_DefaultConstructor {
    E03_DefaultConstructor() {
        System.out.println("Default constructor");
    }
    public static void main(String args[]) {
        new E03_DefaultConstructor();
    }
}
/*
    Here we create the E03_DefaultConstructor object for the side effects of the
    constructor call, so there is no need to create and hold a reference to the object.
    In practice, when an operation doesn’t actually require an object, then a static
    utility method is more appropriate.*/
