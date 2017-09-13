package ch15_containersindepth.mapgenerators;

import util.CountingGenerator;
import util.Generator;
import util.RandomGenerator;

import java.util.Iterator;
import java.util.Map;

import static util.Print.print;

/**
 * Created by Vasiliy Kylik on 20.07.2017.
 */
class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {

  private int size = 9;
  private int number = 1;
  private char letter = 'A';

  public Pair<Integer, String> next() {
    return new Pair<Integer, String>(
            number++, "" + letter++);
  }

  public Iterator<Integer> iterator() {
    return new Iterator<Integer>() {
      public Integer next() {
        return number++;
      }

      public boolean hasNext() {
        return number < size;
      }

      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }
}

public class MapDataTest {
  public static void main(String[] args) {
    // Pair Generator
    print(MapData.map(new Letters(), 11));
    // Two separate Generators
    print(MapData.map(new CountingGenerator.Character(),
            new RandomGenerator.String(3), 8));
    // A key Generator and a single value
    print(MapData.map(new CountingGenerator.Character(),"Value",6));
    // An Iterable and a value Generator
    print(MapData.map(new Letters(),new RandomGenerator.String(3)));
    // An Iterable and a single value
    print(MapData.map(new Letters(), "Pop"));
  }
}
