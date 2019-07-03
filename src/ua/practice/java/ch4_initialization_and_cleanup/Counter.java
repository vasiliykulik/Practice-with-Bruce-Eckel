package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 03.07.2019.
 */
public class Counter {
    int i;
    Counter() { i = 7; }
// ...
}
/*then i will first be initialized to 0, then to 7. This is true with all the primitive types and with
object references, including those that are given explicit initialization at the point of
definition. For this reason, the compiler doesn’t try to force you to initialize elements in the
constructor at any particular place, or before they are used—initialization is already
guaranteed*/