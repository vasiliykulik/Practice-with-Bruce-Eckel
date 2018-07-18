package ch16_Concurrency;

/**
 * @author Vasiliy Kylik on(Rocket) on 17.07.2018.
 */
public class MainThread {
  public static void main(String[] args) {
    LiftOff launch = new LiftOff();
    launch.run();
  }
}
