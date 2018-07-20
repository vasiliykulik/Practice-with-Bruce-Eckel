package ch16_Concurrency;

import java.util.concurrent.TimeUnit;

import static util.Print.print;

/**
 * @author Vasiliy Kylik on(Rocket) on 20.07.2018.
 */
public class SimpleDaemons implements Runnable {
  public static void main(String[] args) throws Exception {
    for (int i = 0; i < 10; i++) {
      Thread daemon = new Thread(new SimpleDaemons());
      daemon.setDaemon(true);
      daemon.start();
    }
    print("All daemons started");
    // Program will be terminated after next TimeOut, because we set daemon flag to created threads daemon.setDaemon(true);
    TimeUnit.MILLISECONDS.sleep(175);
  }

  @Override
  public void run() {
    try {
      while (true) {
        TimeUnit.MILLISECONDS.sleep(100);
        print(Thread.currentThread() + " " + this);
      }
    } catch (InterruptedException e) {
      print("sleep () interrupted");
    }
  }
}
