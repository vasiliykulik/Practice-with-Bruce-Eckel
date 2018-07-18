package ch16_Concurrency;

/**
 * @author Vasiliy Kylik on(Rocket) on 17.07.2018.
 */
public class LiftOff implements Runnable {
  private static int taskCount = 0;
  private final int id = taskCount++;
  protected int countDown = 10; // Default

  public LiftOff() {
  }

  public LiftOff(int countDown) {
    this.countDown = countDown;
  }

  public String status() {
    return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "), ";
  }

  public void run() {
    // first, there is the comparison operation then the arithmetic operation
    while (countDown-- > 0) {
      System.out.print(status());
    // 52 sec wo Thread.yield(), more than 64 sec with Thread.yield() on simple operation (), int countDown = 10000000;
      Thread.yield();
    }
  }
}
