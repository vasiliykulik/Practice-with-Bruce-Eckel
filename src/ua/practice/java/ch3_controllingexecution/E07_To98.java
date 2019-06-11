package ch3_controllingexecution;

/****************** Exercise 7 ******************
 * Modify Exercise 1 so the program exits by
 * using the break keyword at value 99. Try using
 * return instead.
 ************************************************/
public class E07_To98 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i == 99)
                break;
            System.out.print(i + " ");
        }
    }
}
