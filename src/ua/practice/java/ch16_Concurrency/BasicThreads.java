package ch16_Concurrency;

/**
 * @author Vasiliy Kylik on(Rocket) on 17.07.2018.
 */
public class BasicThreads {
  public static void main(String[] args) {
    Thread t = new Thread(new LiftOff());
    t.start();
    System.out.println("Waiting for LiftOff");
  }
}
