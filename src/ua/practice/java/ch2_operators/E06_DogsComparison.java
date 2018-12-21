package ch2_operators;
import static util.Print.print;

/**
 * Created by Vasiliy Kylik (Lightning) on 21.12.2018.
 */
/****************** Exercise 6 *****************
 * Following Exercise 5 assign, a new E05_Dog
 * reference to spot's object. Test for comparison
 * using == and equals() for all references.
 ***********************************************/
public class E06_DogsComparison {
    static void compare(E05_Dog dog1, E05_Dog dog2){
        print("== on top references: " + (dog1==dog2));
        print("equals() on top references" + dog1.equals(dog2));

        print("== on top names: " + (dog1.name==dog2.name));
        print("equals() on top names" + dog1.name.equals(dog2.name));

        print("== on top says: " + (dog1.says==dog2.says));
        print("equals() on top says" + dog1.says.equals(dog2.says));
    }

    public static void main(String[] args) {
        E05_Dog dog1 = new E05_Dog();
        E05_Dog dog2 = new E05_Dog();
        E05_Dog dog3 = dog1; // Aliased reference
        dog1.name = "spot";
        dog1.says = "Ruff!";
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        System.out.println(dog1.name+ " : "+dog1.says);
        System.out.println(dog2.name+ " : "+dog2.says);

    }
}
