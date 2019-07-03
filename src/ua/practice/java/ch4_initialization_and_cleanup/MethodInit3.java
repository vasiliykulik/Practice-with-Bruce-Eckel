package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 03.07.2019.
 */
public class MethodInit3 {
    //! int j = g(i); // Illegal forward reference
    int i = f();
    int f() { return 11; }
    int g(int n) { return n * 10; }
}
