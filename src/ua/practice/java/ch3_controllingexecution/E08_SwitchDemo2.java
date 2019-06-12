package ch3_controllingexecution;

public class E08_SwitchDemo2 {
    public static void main(String[] args) {
        for(int i = 0; i < 7; i++)
            switch(i) {
                case 1: System.out.println("case 1");
                case 2: System.out.println("case 2");
                case 3: System.out.println("case 3");
                case 4: System.out.println("case 4");
                case 5: System.out.println("case 5");
                default: System.out.println("default");
            }
    }
}
/*
    Without the break, each case falls through to the next one. When you select
    case 1 you get all the other cases as well, so you’ll almost always want a break
    at the end of each case.
*/