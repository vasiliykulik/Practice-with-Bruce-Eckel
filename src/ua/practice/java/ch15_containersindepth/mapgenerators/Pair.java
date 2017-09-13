package ch15_containersindepth.mapgenerators;

/**
 * Created by Vasiliy Kylik on 20.07.2017.
 */
public class Pair<K, V> {
  /*The key and value fields are made public and final
   so that Pair becomes a read-only Data Transfer Object (or Messenger).*/
  public final K key;
  public final V value;

  public Pair(K k, V v) {
    this.key = k;
    this.value = v;
  }
}
