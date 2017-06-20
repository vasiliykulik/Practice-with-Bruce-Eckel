package ch15_containersindepth.e04addtolistwordsfromfile;

import util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Vasiliy Kylik on 20.06.2017.
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words  = new TreeSet<>(
        new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
