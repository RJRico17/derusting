import java.util.*;

public class SetPractice {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();
    set.add("Philippines");
    set.add("USA");
    set.add("Canada");

    System.out.println("Contains Philippines? " + set.contains("Philippines"));
    
    set.remove("USA");

    System.out.println("Size of the HashSet: " + set.size());

    for (String i : set) {
      System.out.println(i);
    }

    // Get the size of the Set

    // Iterate over the elements of the Set, printing each one on a separate line

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
