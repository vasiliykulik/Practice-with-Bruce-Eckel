package ch16_Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Vasiliy Kylik on(Rocket) on 19.07.2018.
 */
public class FixedThreadPool {
  public static void main(String[] args) {
    ExecutorService exec = Executors.newFixedThreadPool(5);
    for (int i = 0; i < 5; i++) {
      exec.execute(new LiftOff());

    }
    exec.shutdown();
  }
}