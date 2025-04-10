package HeapsOrPriorityQueues;

import java.util.Collections;
import java.util.PriorityQueue;

public class Basic {
    public static void main(String[] args) {

        /*
         time complexity -
         for add -> O(log n),  if we add n element then --> O(n logn)
         for remove/poll -> O(log n)
         for peek -> O(1)
         for size -> O(1)
        */

        // by default this is a min heap i.e. min element at the top
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq+", Peek element "+pq.peek());
        pq.add(10);
        System.out.println(pq+", Peek element "+pq.peek());
        pq.add(1);
        System.out.println(pq+", Peek element "+pq.peek());
        pq.remove();
        System.out.println(pq+", Peek element "+pq.peek());
        pq.add(-43);
        System.out.println(pq+", Peek element "+pq.peek());
        System.out.println("Size of pq: "+pq.size());
        System.out.println();

        // max heap
//        PriorityQueue<Integer> rpq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> rpq = new PriorityQueue<>((a,b) -> b-a);
        rpq.add(2);
        System.out.println(rpq+", Peek element "+rpq.peek());
        rpq.add(10);
        System.out.println(rpq+", Peek element "+rpq.peek());
        rpq.add(1);
        System.out.println(rpq+", Peek element "+rpq.peek());
        rpq.remove();
        System.out.println(rpq+", Peek element "+rpq.peek());
        rpq.add(-43);
        System.out.println(rpq+", Peek element "+rpq.peek());
        System.out.println("Size of rpq: "+rpq.size());
    }
}
