package HashSet;

import java.util.HashSet;

public class IteratingHashSet {
    public static void main(String[] args) {
        // we cannot use for/while loop to travel bcz there is no concept of index
        HashSet<String> set = new HashSet<>();
        set.add("Aman");
        set.add("gagan");
        set.add("naman");
        set.add("chirkut");
        System.out.println(set);

        // we can print the set using foreach loop as well ---> iteration
        for(String s : set){
            System.out.print(s+" ");
//            set.add("chitrakut");   // we cannot add or remove any element while iterating in the loop  --> error
        }
        System.out.println();
//         if we wnat to remove all the elements in the set we can use .clear inbuilt function
        set.clear();
        System.out.println(set);
    }
}
