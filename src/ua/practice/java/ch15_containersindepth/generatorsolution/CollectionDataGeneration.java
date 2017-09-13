package ch15_containersindepth.generatorsolution;

import util.CountingGenerator;
import util.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Vasiliy Kylik on 19.07.2017.
 */
public class CollectionDataGeneration {
  public static void main(String[] args) {
    System.out.println(new ArrayList<String>(
            CollectionData.list(new RandomGenerator.String(9), 10)
    ));
    System.out.println(new HashSet<Integer>(
            new CollectionData<Integer>(
                    new RandomGenerator.Integer(), 10
            )
    ));
  }
}
