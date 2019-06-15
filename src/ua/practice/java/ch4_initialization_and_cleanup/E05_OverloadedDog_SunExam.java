package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.06.2019.
 */
class Dog1 {
    public void bark() {
        System.out.println("Default bark!");
    }
    public void bark(int i) {
        System.out.println("int bark = howl");
    }
    public void bark(double d) {
        System.out.println("double bark = yip");
    }
    public boolean print(int i){
        System.out.println(i);
        return (true);
    }
    public long print(long i){
        System.out.println(i);
        return (i);
    }
// Etc. ...
}
public class E05_OverloadedDog_SunExam {
    public static void main(String args[]) {
        Dog1 dog = new Dog1();
        dog.bark();
        dog.bark(1);
        dog.bark(1.1);
        System.out.println(dog.print((long)10));
    }
}
/*
    As an additional challenge, write a class with a method boolean print(int) that
        prints a value and returns a boolean. Now overload the method to return a
        long. (This is similar to some questions on the Sun Java Certification Exam.)*/