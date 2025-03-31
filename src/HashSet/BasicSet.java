package HashSet;

import java.util.HashSet;
import java.util.Objects;

public class BasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(21);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);  // set is like a bag, elements will be scrambled
        System.out.println(set.contains(2));  // true/false
        System.out.println(set.contains(50));  // true/false

        System.out.println("Size is "+set.size());
        set.remove(21);
        System.out.println(set);
        Object[] arr = set.toArray();   // treats the element like array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
