package ch4_initialization_and_cleanup;

/**
 * @author Vasiliy Kylik on(Rocket) on 06.11.2019.
 */
public class E01_StringArray {
    public static void main(String[] args) {
        String sa1[] = new String[4];
        sa1[0] = "These";
        sa1[1] = "are";
        sa1[2] = "some";
        sa1[3] = "strings";
        for(int i = 0; i<sa1.length;i++){
            System.out.println(sa1[i]);
        }
        String sa2[] = {"These ","Are ","Some ","String"};
        for(int i = 0; i<sa2.length;i++){
            System.out.print(sa2[i]);
        }
    }
}
