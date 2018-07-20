package ch16_Concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * @author Vasiliy Kylik on(Rocket) on 20.07.2018.
 */
public class DaemonThreadFactory implements ThreadFactory {
  public Thread newThread(Runnable r) {
    Thread t = new Thread(r);
    t.setDaemon(true);
    return t;
  }
}
