package ch3_controllingexecution;

/**
 * @author Vasiliy Kylik on(Rocket) on 17.04.2019.
 */
public class ListCharacters {
    public static void main(String[] args) {
        for(char c = 0; c<128; c++){
            if(Character.isLowerCase(c)){
                System.out.println("value: " + (int)c +
                " character: " + c);
            }
        }
    }
}
