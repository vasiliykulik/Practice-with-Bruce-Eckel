package ch15_containersindepth;

import util.CountingGenerator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static util.Countries.names;

/****************** Exercise 3 ******************
 * Using Countries, fill a Set with the same data
 * multiple times, then verify that the Set ends up
 * with only one of each instance. Try this with
 * HashSet, LinkedHashSet, and TreeSet.
 ************************************************/
public class E03_VerifySet {
  public static void main(String[] args) {
    Set<String> set = new TreeSet<>();
    for(int i=0;i<5;i++)
      set.addAll(names(10));
      System.out.println(2);
    System.out.println(set);
  }
}
