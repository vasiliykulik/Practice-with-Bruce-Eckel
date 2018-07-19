package ch16_Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author Vasiliy Kylik on(Rocket) on 19.07.2018.
 */
public class SleepingTask extends LiftOff {
  public static void main(String[] args) {
    ExecutorService exec = Executors.newCachedThreadPool();
    for (int i = 0; i < 5; i++) {
      exec.execute(new SleepingTask());
    }
    exec.shutdown();
  }

  public void run() {
    try {
      while (countDown-- > 0) {
        System.out.println(status());
        TimeUnit.MILLISECONDS.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.err.println("Interrupted");
    }
  }
}
