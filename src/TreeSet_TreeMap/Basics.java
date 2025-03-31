package TreeSet_TreeMap;

import java.util.TreeSet;

public class Basics {
    public static void main(String[] args) {
        // unlike hashmap and hashset whu=ich take O(1) time complexity for search, insertion, deletion, tree set and treemap
        // take almost O(log n) time complexity.
        // but in tree set and tree map the order is sorted
        TreeSet<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(21);
        set.add(3);
        set.add(4);
        set.add(5);
        
        System.out.println(set);  // printed in a sorted order
        System.out.println(set.size());
//        set.remove(21);
        System.out.println(set.first());; // gives the first ele in the set
        System.out.println(set.pollFirst()); // removes and print out the first element
        System.out.println(set.pollLast()); // removes and print out the first element
    }
}
