package ch16_Concurrency;

import static util.Print.printnb;

/**
 * Created by Vasiliy Kylik (Lightning) on 24.07.2018.
 */

/*Experiment with different sleep times in Daemons.java to see what happens*/
class Daemon2 implements Runnable{
private Thread[]t = new Thread[10];
    @Override
    public void run() {
        for(int i=0; i<t.length;i++){
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            printnb("DaemonSpawn " + i + " started. ")
        }
    }
}
public class E07_Daemons2 {

}
