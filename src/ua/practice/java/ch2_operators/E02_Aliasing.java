package ch2_operators;
import static util.Print.print;

/**
 * Created by Vasiliy Kylik (Lightning) on 18.12.2018.
 */
    class Integral{
        float f;
    }
public class E02_Aliasing {
    public static void main(String[] args) {
        Integral n1 = new Integral();
        Integral n2 = new Integral();
        n1.f = 9f;
        n2.f = 47f;
        print("1: n1.f: " + n1.f + ", n2.f: " + n2.f );
        n1 = n2;
        // effect of aliasing after n2 is assigned to n1: they both point to the same object
        print("1: n1.f: " + n1.f + ", n2.f: " + n2.f );
        n1.f  = 27f;
        print("1: n1.f: " + n1.f + ", n2.f: " + n2.f );
    }
}

