package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.06.2019.
 */
class Person {
    public void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}
class Peeler {
    static Apple peel(Apple apple) {
// ... remove peel
        return apple; // Peeled
    }
}
class Apple {
    Apple getPeeled() { return Peeler.peel(this); }
}
public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
/*
    Apple needs to call Peeler.peel( ), which is a foreign utility method that performs an
        operation that, for some reason, needs to be external to Apple (perhaps the external method
        can be applied across many different classes, and you don’t want to repeat the code). To pass
        itself to the foreign method, it must use this*/
