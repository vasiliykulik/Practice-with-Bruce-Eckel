package ch3_controllingexecution;

/**
 * Created by Vasiliy Kylik (Lightning) on 28.03.2019.
 */
public class WhileTest {
    static boolean condition(){
        boolean result = Math.random()<0.99;
        System.out.println(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while(condition())
            System.out.println("Inside 'while'");
        System.out.println("Exited 'while'");
    }
}
