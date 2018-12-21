package ch2_operators;

/**
 * Created by Vasiliy Kylik (Lightning) on 20.12.2018.
 */
public class E05_Dog {
    String name;
    String says;

    public static void main(String[] args) {
        E05_Dog dog1 = new E05_Dog();
        E05_Dog dog2 = new E05_Dog();
        dog1.name = "spot";
        dog1.says = "Ruff!";
        dog2.name = "scruffy";
        dog2.says = "Wurf!";
        System.out.println(dog1.name+ " : "+dog1.says);
        System.out.println(dog2.name+ " : "+dog2.says);
    }
}
