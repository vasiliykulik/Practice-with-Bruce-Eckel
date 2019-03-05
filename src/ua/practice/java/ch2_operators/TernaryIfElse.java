package ch2_operators;

import static util.Print.print;

/**
 * @author Vasiliy Kylik on(Rocket) on 06.03.2019.
 */
public class TernaryIfElse {
    static int ternary(int i){
        return i < 10 ? i*100 : i *10;
    }

    static int standardIfElse(int i){
        if(i<10)
            return i*100;
        else
            return i*10;
    }

    public static void main(String[] args) {
        print(ternary(9));
        print(ternary(10));
        print(standardIfElse(9));
        print(standardIfElse(10));
    }
}
