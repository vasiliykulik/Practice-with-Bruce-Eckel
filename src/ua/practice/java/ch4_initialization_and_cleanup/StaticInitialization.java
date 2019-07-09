package ch4_initialization_and_cleanup;

import static util.Print.print;

/**
 * Created by Vasiliy Kylik (Lightning) on 03.07.2019.
 */
// Specifying initial values in a class definition.
class Bowl {
    Bowl(int marker) {
        print("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        print("f1(" + marker + ")"); // 4   // 12   //15
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);// 1 static

    Table() {
        print("Table()"); // 3 constructor
        bowl2.f1(1);
    }

    void f2(int marker) {
        print("f2(" + marker + ")");
    }

    static Bowl bowl2 = new Bowl(2); // 2 static
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);       // 6
    static Bowl bowl4 = new Bowl(4); // 4 static

    Cupboard() {
        print("Cupboard()");                // 7    //  11  //14
        bowl4.f1(2);                 // 8   //  12  //15
    }

    void f3(int marker) {
        print("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5); // 5 static
}

public class StaticInitialization {
    public static void main(String[] args) {
        print("Creating new Cupboard() in main");   // 9
        new Cupboard();                             // 10
        print("Creating new Cupboard() in main");   // 13
        new Cupboard();
        table.f2(1);                        // 16
        cupboard.f3(1);                     // 17
    }


    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
} /* Output:
Bowl(1)
Bowl(2)
Table()
f1(1)
Bowl(4)
Bowl(5)
Bowl(3)
Cupboard()
f1(2)
Creating new Cupboard() in main
Bowl(3)
Cupboard()
f1(2)
Creating new Cupboard() in main
Bowl(3)
Cupboard()
f1(2)
f2(1)
f3(1)
*/