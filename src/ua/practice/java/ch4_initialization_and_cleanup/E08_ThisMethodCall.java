package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 16.06.2019.
 */
/****************** Exercise 8 *****************
 * Create a class with two methods. Within the
 * first method call the second method twice to
 * see it work, the first time without using this,
 * and the second time using this.
 * (You should not use this form in practice.)
 ***********************************************/
public class E08_ThisMethodCall {
    public void a() {
        b();
        this.b();
    }
    public void b() {
        System.out.println("b() called");
    }
    public static void main(String args[]) {
        new E08_ThisMethodCall().a();
    }
}
/*
    This exercise shows that this refers to the current object. Use the this.b( ) style
        of method call only when necessary; otherwise you risk confusing the
        reader/maintainer of your code.*/
