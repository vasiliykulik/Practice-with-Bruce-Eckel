package ch16_Concurrency;

import static util.Print.print;
import static util.Print.printnb;

/**
 * Created by Vasiliy Kylik (Lightning) on 22.07.2018.
 */
// Daemon threads spawn other daemon threads.

class Daemon implements Runnable {
    private Thread[] t = new Thread[10];

    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            printnb("DaemonSpawn " + i + " started, ");
        }
        for(int i= 0; i<t.length; i++){
            printnb("t[" + i + "].isDaemon() =  " +
                    t[i].isDaemon()+ ", ");
        }
        while(true){
            Thread.yield();
        }
    }
}

class DaemonSpawn implements Runnable{
    public void run(){
        while (true){
            Thread.yield();
        }
    }
}

public class Daemons {

}
