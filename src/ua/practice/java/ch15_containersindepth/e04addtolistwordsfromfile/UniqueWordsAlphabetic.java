package ch15_containersindepth.e04addtolistwordsfromfile;

import util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Vasiliy Kylik on 20.06.2017.
 */
public class UniqueWordsAlphabetic {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("SetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
