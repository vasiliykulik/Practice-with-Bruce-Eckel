package ch4_initialization_and_cleanup;

/**
 * Created by Vasiliy Kylik (Lightning) on 18.06.2020.
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Can take individual elements:
        printArray(new Integer(47), new Float(3.14),
                new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
// Or an array:
        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray(); // Empty list is OK
    }
}
