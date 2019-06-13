package ch4_initialization_and_cleanup;
/****************** Exercise 2 *****************
 * Create a class with a String field initialized
 * at the point of definition, and another one
 * initialized by the constructor. What is the
 * difference between the two approaches?
 ***********************************************/
public class E02_StringInitialization {
    String s1 = "Initialized at definition";
    String s2;

    public E02_StringInitialization(String s2) {
        this.s2 = s2;
    }
    public static void main(String args[]) {
        E02_StringInitialization si = new E02_StringInitialization("Initialized at construction");
        System.out.println("si.s1 = " + si.s1);
        System.out.println("si.s2 = " + si.s2);
    }
}
