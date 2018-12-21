package ch2_operators;

/**
 * Created by Vasiliy Kylik (Lightning) on 20.12.2018.
 */
public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        System.out.println(dog1.name+ " : "+dog1.says);
        System.out.println(dog2.name+ " : "+dog2.says);
    }
}
