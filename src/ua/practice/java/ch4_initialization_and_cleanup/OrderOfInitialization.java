package ch4_initialization_and_cleanup;

import static util.Print.print;

/**
 * Created by Vasiliy Kylik (Lightning) on 03.07.2019.
 */
// Demonstrates initialization order.
// When the constructor is called to create a
// Window object, you’ll see a message:
class Window {
    Window(int marker) {
        print("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1); // Before constructor

    /*Within a class, the order of initialization is determined by the order that the variables are
defined within the class. The variable definitions may be scattered throughout and in between method definitions,
 but the variables are initialized before any methods can be
called—even the constructor. */
    House() {
// Show that we’re in the constructor:
        print("House()");
        w3 = new Window(33); // Reinitialize w3
    }

    Window w2 = new Window(2); // After constructor

    void f() {
        print("f()");
    }

    Window w3 = new Window(3); // At end
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f(); // Shows that construction is done
    }
}
/* Output:
Window(1)
Window(2)
Window(3)
House()
Window(33)
f()
*/
/*In House, the definitions of the Window objects are intentionally scattered about to prove
that they’ll all get initialized before the constructor is entered or anything else can happen. In
addition, w3 is reinitialized inside the constructor.
From the output, you can see that the w3 reference gets initialized twice: once before and
once during the constructor call. (The first object is dropped, so it can be garbage collected
later.) This might not seem efficient at first, but it guarantees proper initialization—what
would happen if an overloaded constructor were defined that did not initialize w3 and there
wasn’t a “default” initialization for w3 in its definition?*/