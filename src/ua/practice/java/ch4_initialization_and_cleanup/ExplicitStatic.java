package ch4_initialization_and_cleanup;

import static util.Print.print;

/**
 * @author Vasiliy Kylik on(Rocket) on 10.07.2019.
 */
// Explicit static initialization with the "static" clause.

class Cup {
    Cup(int marker) {
        print("Cup(" + marker + ")");
    }
    void f(int marker) {
        print("f(" + marker + ")");
    }
}
class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        print("Cups()");
    }
}
public class ExplicitStatic {
    public static void main(String[] args) {
        print("Inside main()");
        Cups.cup1.f(99); // (1)
 //       Cups.cup1.f(99); // (1)
    }
// static Cups cups1 = new Cups(); // (2)
// static Cups cups2 = new Cups(); // (2)
}
