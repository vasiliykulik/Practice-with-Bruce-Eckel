package ch15_containersindepth.generatorsolution;

import util.*;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Vasiliy Kylik on 19.07.2017.
 */

  class Goverment implements Generator<String> {
    String[] foundation = ("strange women lying in ponds " +
            "distributing swords is no basis for a system of " +
            "goverment").split(" ");
    private int index;
    public String next() {
      return foundation[index++];
    }
  }
  public class CollectionDataTest{
    public static void main(String[] args) {
      Set<String> set = new LinkedHashSet<String>(
              new CollectionData<String>(new Goverment(),15));
      set.addAll(CollectionData.list(new Goverment(),15));
      System.out.println(set);
    }
  }

