package ch16_Concurrency;

import java.util.concurrent.TimeUnit;

import static util.Print.print;

/**
 * Created by Vasiliy Kylik (Lightning) on 24.07.2018.
 */

class ADaemon implements Runnable {

    @Override
    public void run() {
        try {
            print("Starting ADaemon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            print("Exiting via InterruptedException");
        } finally {
            print("This should always run?");
        }
    }
}

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ADaemon());
        // When you run this program, you’ll see that the finally clause is not executed, but if you
        // comment out the call to setDaemon( ), you’ll see that the finally clause is executed.
        t.setDaemon(true);
        t.start();
    }
}
