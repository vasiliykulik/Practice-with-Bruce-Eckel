package ch16_Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Vasiliy Kylik on(Rocket) on 17.07.2018.
 */
public class CachedThreadPool {
  public static void main(String[] args) {
    ExecutorService exec = Executors.newCachedThreadPool();
    for(int i = 0; i<=5;i++){
      exec.execute(new LiftOff());
    }
  }
}
