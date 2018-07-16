package ch16_Concurrency;

/**
 * @author Vasiliy Kylik on(Rocket) on 17.07.2018.
 */

import util.Generator;

import java.util.Arrays;

/****************** Exercise 2 *****************
 * Following the form of generics/Fibonacci.java,
 * create a task that produces a sequence of n
 * Fibonacci numbers, where n is provided to the
 * constructor of the task. Create a number of these
 * tasks and drive them using threads.
 ***********************************************/
class Fibonacci implements Generator<Integer>, Runnable {
  private final int n;
  private int count;

  public Fibonacci(int n) {
    this.n = n;
  }


  public Integer next() {
    return fib(count++);
  }

  private int fib(int n) {
    if (n < 2) return 1;
    return fib(n - 2) + fib(n - 1);
  }

  @Override
  public void run() {
    Integer[] sequence = new Integer[n];
    for (int i = 0; i < n; i++) {
      sequence[i] = next();
      System.out.println("Seq. of " + n + ": " + Arrays.toString(sequence));
    }
  }
}

public class E02_Fibonacci {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      new Thread(new Fibonacci(i)).start();
    }
  }
}
