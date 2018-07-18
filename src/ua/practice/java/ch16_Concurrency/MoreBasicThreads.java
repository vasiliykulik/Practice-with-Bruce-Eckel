package ch16_Concurrency;

/**
 * @author Vasiliy Kylik on(Rocket) on 17.07.2018.
 */
public class MoreBasicThreads {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      new Thread(new LiftOff()).start();
    }
    System.out.println("Waiting for LiftOff");
  }
}
