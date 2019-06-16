package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.06.2019.
 */
// Simple use of the "this" keyword.
public class Leaf {
    int i = 0;
    Leaf increment() {
        i++;
        return this;
    }
    void print() {
        System.out.println("i = " + i);
    }
    public static void main(String[] args) {
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
    }
}