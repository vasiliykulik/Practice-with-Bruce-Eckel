package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.06.2019.
 */
/****************** Exercise 5 *****************
 * Create a class called Dog with an overloaded
 * bark() method. Your method should be
 * overloaded based on various primitive data
 * types, and should print different types of barking,
 * howling, etc., depending on which overloaded
 * version is called. Write a main() that calls
 * all the different versions.
 ***********************************************/
class Dog {
    public void bark() {
        System.out.println("Default bark!");
    }
    public void bark(int i) {
        System.out.println("int bark = howl");
    }
    public void bark(double d) {
        System.out.println("double bark = yip");
    }
// Etc. ...
}
public class E05_OverloadedDog {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark(1.1);
    }
}
/*
    As an additional challenge, write a class with a method boolean print(int) that
        prints a value and returns a boolean. Now overload the method to return a
        long. (This is similar to some questions on the Sun Java Certification Exam.)*/
