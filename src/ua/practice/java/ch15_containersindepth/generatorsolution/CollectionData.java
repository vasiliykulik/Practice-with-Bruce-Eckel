package ch15_containersindepth.generatorsolution;

import util.Generator;

import java.util.ArrayList;

/**
 * Created by Vasiliy Kylik on 19.07.2017.
 */
public class CollectionData<T> extends ArrayList<T> {
  /*CollectionData is an example of the Adapter design pattern;1
   it adapts a Generator to the constructor for a Collection.*/
  public CollectionData(Generator<T> gen, int quantity) {
    for(int i=0 ; i<quantity; i++)
      add(gen.next());
    }
    // A generic convenience method
    public static <T> CollectionData<T> list (Generator<T> gen, int quantity){
      return new CollectionData<T>(gen, quantity);
  }

}
