package HashSet;

import java.util.HashSet;

public class sameElementAdding {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
//        if we want to add same elment in the set multiple times it will be added only one time 😁
        set.add(5);
        set.add(5);
        set.add(5);
        set.add(5);
        set.add(5);
        System.out.println(set);
//         if we wnat to remove the same element which is added multiple time can be removed by using a single remove function
        set.remove(5);
        System.out.println(set);

    }
}
