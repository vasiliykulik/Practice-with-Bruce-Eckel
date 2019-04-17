package ch3_controllingexecution;

/**
 * @author Vasiliy Kylik on(Rocket) on 17.04.2019.
 */
/****************** Exercise 3 ******************
 * Modify Exercise 2 so your code is
 * surrounded by an "infinite" while loop. It
 * will then run until you interrupt it,
 * typically with Control-C.
 ************************************************/
public class E03_RandomInts2 {
    public static void main(String[] args) {
        while(true){
            E02_RandomInts.compareRand();
        }
    }
}
