/*
 * *** HAMEED / COMP272 002 F24 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    Set<Integer> result = new TreeSet<>(setA);

    result.addAll(setB);

    Set<Integer> same = new TreeSet<>(setA);

    same.retainAll(setB); // Keep only elements in both sets.
    result.removeAll(same);

    return result;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    Iterator<Map.Entry<Integer, String>> itr = treeMap.entrySet().iterator();

    while (itr.hasNext()) {
      Map.Entry<Integer, String> entry = itr.next();
      if (entry.getKey() % 2 == 0) {
        itr.remove(); // if key is even remove entry from map
      }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    return tree1.equals(tree2);
  }

} // end treeProblems class
