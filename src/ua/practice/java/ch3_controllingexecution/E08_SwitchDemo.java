package ch3_controllingexecution;

/****************** Exercise 8 *****************
 * Create a switch statement inside a for loop
 * that tries each case and prints a message. Put
 * a break after each case and test it, then see
 * what happens when you remove the breaks.
 ***********************************************/
public class E08_SwitchDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 7; i++)
            switch(i) {
                case 1: System.out.println("case 1");
                    break;
                case 2: System.out.println("case 2");
                    break;
                case 3: System.out.println("case 3");
                    break;
                case 4: System.out.println("case 4");
                    break;
                case 5: System.out.println("case 5");
                    break;
                default: System.out.println("default");
            }
    }
}
/*
    Without the break, each case falls through to the next one. When you select
    case 1 you get all the other cases as well, so you’ll almost always want a break
    at the end of each case.
*/
