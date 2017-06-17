package ch15_containersindepth;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import static util.Countries.capitals;
import static util.Countries.names;

/**
 * Created by Vasiliy Kylik on 15.06.2017.
 * /****************** Exercise 2 ******************
 * Produce a Map and a Set containing all the
 * countries that begin with 'A'.
 * ***********************************************
 */
public class E02_ACountries {
  public static void main(String[] args) {
    TreeMap<String, String> map = new TreeMap<String, String>(capitals());
    TreeSet<String> set = new TreeSet<String>(names());
    String b = null;
    for (String s : map.keySet())
      if (s.startsWith("B")) {
        b = s;
        System.out.println("1");
        break;
      }
    System.out.println("3");
    Map<String, String> aMap = map.headMap(b);
    Set<String> aSet = set.headSet(b);
    System.out.println("aMap = " + aMap);
    System.out.println("aSet = " + aSet);
  }
}
