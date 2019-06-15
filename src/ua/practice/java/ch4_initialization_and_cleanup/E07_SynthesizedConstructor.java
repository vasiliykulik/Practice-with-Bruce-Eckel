package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.06.2019.
 */
/****************** Exercise 7 ******************
 * Create a class without a constructor, then
 * create an object of that class in main() to
 * verify that the default constructor is
 * automatically synthesized.
 ************************************************/
public class E07_SynthesizedConstructor {
    public static void main(String args[]) {
// Call the synthesized default constructor
// for this class:
        new E07_SynthesizedConstructor();
    }
}
/*
    Because it’s possible to call the constructor, you know it was created, even if you
        can’t see it.*/
