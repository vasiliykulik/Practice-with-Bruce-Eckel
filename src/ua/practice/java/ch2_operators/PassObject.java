package ch2_operators;
import static util.Print.print;
/**
 * Created by Vasiliy Kylik (Lightning) on 18.12.2018.
 */

class Letter{
    char c;
}
public class PassObject {
    static void f(Letter y){
        y.c = 'z'; // is actually changing the object outside of f(), static method or not
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: "+ x.c);
        f(x); // pass an object into a method
        print("2: x.c: "+ x.c);
    }
}
